package LinkedList;

import java.util.ArrayList;

public class OddAndEvenLInkedList {
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
//    Optimal Approach..................................

    public static Node segrationOddEven(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node odd=head;
        Node even=head.next;
        Node evenHead=head.next;
        while (even != null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;

            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
//    Brute Approach...............................

//    public static Node segrationOddEven(Node head){
//        if (head==null || head.next==null){
//            return head;
//        }
//        ArrayList<Integer>map=new ArrayList<>();
//        Node temp=head;
//        while (temp!=null && temp.next!=null){
//           map.add(temp.data);
//           temp=temp.next.next;
//        }
//        if (temp!=null){
//            map.add(temp.data);
//        }
//        temp=head.next;
//        while (temp!=null && temp.next!=null){
//            map.add(temp.data);
//            temp=temp.next.next;
//        }
//        if (temp!=null){
//            map.add(temp.data);
//        }
//
//        int i=0;
//        temp=head;
//        while (temp!=null){
//            temp.data=map.get(i);
//            i++;
//            temp=temp.next;
//        }
//        return head;
//    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        Node head=ArrayToLinkedList(arr);
        head=segrationOddEven(head);
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
