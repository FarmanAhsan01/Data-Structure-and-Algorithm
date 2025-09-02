package LinkedList;

import java.io.PrintStream;

class Nodes{
    int data;
    Nodes next;
    Nodes back;

    Nodes(int data1, Nodes next1,Nodes back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }
    Nodes(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }
};

public class DoublyLinkedList {
    //convertArr2Dll
    public static Nodes convert2DLL(int arr[]){
        Nodes head=new Nodes(arr[0]);
        Nodes prev=head;

        for (int i=1;i<arr.length;i++){
            Nodes temp=new Nodes(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    //length of Doubly LinkedList.............

    public static int lengthOfDLL(Nodes head){
        int cnt=0;
        Nodes temp=head;
        while (temp != null) {
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }

//    Deletion of Doubly LinkedList

    //Delete head of Linked List
    public static Nodes headOfDLL(Nodes head){
        Nodes prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;

        return head;
    }
    //delete tail of the list
    public static Nodes tailOfDLL(Nodes head){
        Nodes tail=head;

        while(tail.next!=null){
            tail=tail.next;
        }
        Nodes prev=tail.back;
        prev.next=null;
        tail.back=null;


        return head;
    }

    //delete kth element of the list

    public static Nodes kthElementOfDLList(Nodes head, int k){
        Nodes temp=head;
        int cnt=0;

        while (temp!=null){
            cnt++;
            if (cnt==k){
              break;
            }
            temp=temp.next;
        }
        Nodes prev=temp.back;
        Nodes front=temp.next;

        if (prev==null && front ==null){
            return null;
        }
        else if(prev==null){
            return headOfDLL(head);
        }
        else if (front==null) {
            return tailOfDLL(head);
        }
        prev.next=front;
        front.back=prev;
        temp.next=null;
        temp.back=null;

        return head;
    }
    public static void deleteNode(Nodes temp){
        Nodes prev=temp.back;
        Nodes front=temp.next;

        if (front==null){
            prev.next=null;
            temp.back=null;
            return;
        }
        prev.next=front;
        front.back=prev;

        temp.next=temp.back=null;

    }

//    Insertion in doubly LinkedList
//    Insertion of head
    public static Nodes InsertionBeforeHead(Nodes head,int val){
        Nodes newHead=new Nodes(val,head,null);
        head.back=newHead;
        head=newHead;
        return head;
    }
    //  Insertion of tail

    public static Nodes InsertionBeforeTail(Nodes head ,int val){
        Nodes tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }
        Nodes prev=tail.back;
        Nodes newHead=new Nodes(val,tail,prev);
        prev.next=newHead;
        tail.back=newHead;

        return head;
    }

    //Insertion before kth element

    public static Nodes InsertionBeforeKthElement(Nodes head,int k ,int val){
        Nodes temp=head;
        int cnt=0;
        while (temp.next!=null){
            cnt++;
            if (cnt==k){
              break;
            }
            temp=temp.next;
        }
        Nodes prev =temp.back;
        Nodes newNode=new Nodes(val,temp,prev);
        prev.next=newNode;
        temp.back=newNode;

        return head;
    }

    //InsertionBeforeHead....................
    public static void InsertionBeforeNode(Nodes node ,int val){
        Nodes prev=node.back;
        Nodes newNode=new Nodes(val,node,prev);
        prev.next=newNode;
        node.back=newNode;
    }

    //Insertion At tail.................................
    public static Nodes insertAtTail(Nodes head,int k){
        if (head==null){
            return new Nodes(k);
        }
        Nodes tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }
        Nodes newNode=new Nodes(k,null,tail);
        tail.next=newNode;
        return head;

    }


    public static void main(String[] args) {
        int arr[]={1,5,6,8};
        int k=1;

        Nodes head=convert2DLL(arr);
//        head=headOfDLL(head);
//        head=tailOfDLL(head);
//        head=kthElementOfDLList(head,k);
//        deleteNode(head.next.next);
//        head=InsertionBeforeHead(head,100);
//        head=InsertionBeforeTail(head,100);
//        head=InsertionBeforeKthElement(head,3,100);

//        InsertionBeforeNode(head.next.next,100);
       head= insertAtTail(head,100);


//        System.out.println(lengthOfDLL(head));
        Nodes temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
