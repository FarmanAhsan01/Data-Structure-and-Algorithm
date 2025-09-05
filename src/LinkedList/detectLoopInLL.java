package LinkedList;

import javax.naming.InsufficientResourcesException;
import java.util.HashMap;

public class detectLoopInLL {
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

    //Brute Approach....................................

//    public static boolean detectLoop(Node head){
//        HashMap<Node, Integer> map=new HashMap<>();
//        Node temp=head;
//        while (temp!=null){
//            if (map.containsKey(temp)){
//                return true;
//            }
//            map.put(temp,1);
//            temp=temp.next;
//        }
//        return false;
//    }

    //Optimal Approach..................................

    public static boolean detectLoop(Node head){
        Node slow = head;
        Node fast= head;

        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,3,9,3};
        Node head=ArrayToLinkedList(arr);
        System.out.println(detectLoop(head));
    }
}
