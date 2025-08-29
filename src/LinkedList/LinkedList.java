package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class LinkedList {
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
    public static int lengthOfLL(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt ;
    }

    public static int checkIfPresent(Node head ,int val){
        Node temp=head;
        while(temp!=null){
            if (temp.data==val){
                return 1;
            }
            temp=temp.next;
        }
        return 0;

    }
        public static void main(String[] args) {
            int arr[]={1,5,6,8};

//            Node y=new Node(arr[3]);
//            System.out.println(y.data);

            Node head =convertArr2LL(arr);
//            System.out.print(head.data);

            //traversal in LL
//            Node temp=head;
//            while(temp!=null){
//                System.out.print(temp.data+" ");
//                temp=temp.next;
//            }

            //length of LL
            System.out.println("length of Linked List "+lengthOfLL(head));
            int val=6;
            System.out.println("check value is present "+checkIfPresent(head,val));

        }
}
