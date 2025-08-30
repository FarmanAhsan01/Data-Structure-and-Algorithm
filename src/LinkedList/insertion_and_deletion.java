package LinkedList;

import java.util.Stack;

public class insertion_and_deletion {
    public static Node convertArr2LL(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for (int i=1;i<arr.length;i++){
            Node temp =new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }
    //delete head from LL
    public static Node deleteHead(Node head){
        Node temp=head;
        head=head.next;
        //garbage collector auto delete from the heap memory
        return head;
    }

    //delete tail from LL
    public static Node deleteTail(Node head){
        Node temp=head;
        if (head==null || head.next==null)  return null;

        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next = null;
        return head;
    }
    //delete kth element of the LL
    public static Node deleteKthElement(Node head , int k){
        if (head==null) return null;
        if (k==1){
            head=head.next;
            return head;
        }
        int cnt =0;
        Node temp=head;
        Node prev= null;
        while(temp!=null){
            cnt++;
            if (cnt==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    //remove node using element....................
    public static Node removeElement(Node head, int ele){
        if (head==null) return null;
        if (head.data==ele){
            head=head.next;
            return head;
        }
        Node temp=head;
        Node prev=null;
        while (temp!=null){
            if (temp.data==ele){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    //Insertion LL..........................................
    //insert on head..........................
    public static Node insertHead(Node head,int val){
        Node temp=new Node(val,head);
        return temp;
    }

    //Insert on tail...........................
    public static Node insertTail(Node head, int val){
        if (head==null){
            return new Node(val);
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(val);
        temp.next=newNode;
        return head;
    }

    //Insert on kth Position....................................

    public static Node InsertKthElement(Node head,int ele, int k){
        if (head==null){
            if (k==1){
                return new Node(ele,head);
            }
            else {
                return null;
            }
        }
        if (k==1){
            Node temp=new Node(ele,head);
            return temp;
        }
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            if (cnt==k-1){
                Node x=new Node(ele);
                x.next=temp.next;
                temp.next=x;
                return head;
            }
            temp=temp.next;
        }

        return head;
    }

//    insert elem using value

    public static Node insertAfterElem(Node head, int ele,int val){
        if (head==null){
            return null;
        }
        if (head.data==val){
            return new Node(ele,head);
        }
        Node temp=head;
        while(temp.next!=null){
            if (temp.next.data==val){
                Node x=new Node(ele,temp.next);
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;
    }



    public static void main(String[] args) {
        int arr[]={1,5,6,8};
        Node head =convertArr2LL(arr);
//        head=deleteHead(head);
//        head=deleteTail(head);
//        head=deleteKthElement(head,3);
//        head=removeElement(head,1);
//        head=insertHead(head,100);
//        head=insertTail(head,190);
//        head=InsertKthElement(head,100,1);
        head=insertAfterElem(head,100,6);

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
}
