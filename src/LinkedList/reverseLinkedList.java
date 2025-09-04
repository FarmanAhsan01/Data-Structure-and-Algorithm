package LinkedList;

import com.sun.source.tree.BreakTree;

import java.util.Stack;

public class reverseLinkedList {
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


    //Brute Approach................................
//    public static Node reverseList(Node head){
//        Node temp=head;
//        Stack<Integer>st=new Stack<>();
//        while (temp!=null){
//            st.push(temp.data);
//            temp=temp.next;
//        }
//        temp=head;
//        while (temp!=null){
//            temp.data=st.pop();
//            temp=temp.next;
//        }
//        return head;
//    }

    //Optimal Approach(1)....................................

//    public  static  Node reverseList(Node head){
//        Node temp=head;
//        Node prev=null;
//        while (temp!=null){
//            Node front=temp.next;
//            temp.next=prev;
//            prev=temp;
//            temp=front;
//        }
//        return prev;
//    }

//    Optimal Approach(2)................................................

    public static Node reverseList(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead=reverseList(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }

    public static void main(String[] args) {
        int arr[]={1,3,2,5};
        Node head=ArrayToLinkedList(arr);
        head=reverseList(head);
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
