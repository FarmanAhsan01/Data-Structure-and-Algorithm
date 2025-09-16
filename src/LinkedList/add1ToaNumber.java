package LinkedList;

public class add1ToaNumber {
    public static Node ArrayToLinkedList(int arr[]){
        Node head=new Node(arr[0]);
        Node mover=head;
        for (int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public  static  Node reverseLL(Node head){
        Node temp=head;
        Node prev=null;
        while (temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
//    Brute Approach.........................................

//    public static Node addNumber(Node head){
//        head=reverseLL(head);
//        Node temp=head;
//        int carry=1;
//        while (temp!=null){
//            temp.data=temp.data+carry;
//            if (temp.data<10){
//                carry=0;
//                break;
//            }
//            else{
//                temp.data=0;
//                carry=1;
//            }
//            temp=temp.next;
//        }
//        if (carry==1){
//            Node newNode=new Node(1);
//            head=reverseLL(head);
//            newNode.next=head;
//            return newNode;
//        }
//        head=reverseLL(head);
//        return head;
//    }

//    Optimal Approach......................................
    public static int helper(Node temp){
        if (temp==null){
            return 1;
        }
        int carry=helper(temp.next);
        temp.data=temp.data+carry;
        if (temp.data<10) return 0;
        temp.data=0;
        return 1;
    }
    public static Node addNumber(Node head){
        int carry=helper(head);
        if (carry==1){
            Node newNode=new Node(1);
            newNode.next=head;
            return  newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[]={1,9,9,9};
        Node head=ArrayToLinkedList(arr);
        head=addNumber(head);
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
