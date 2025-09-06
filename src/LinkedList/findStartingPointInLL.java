package LinkedList;

import java.util.HashMap;

public class findStartingPointInLL {

//Brute Approach...................................
//    public static Node LoopStartingPoint(Node head){
//        Node temp=head;
//        HashMap<Node,Integer>map=new HashMap<>();
//        while (temp!=null){
//            if (map.containsKey(temp)){
//                return temp;
//            }
//            map.put(temp,1);
//            temp=temp.next;
//        }
//        return null;
//    }
//    Optimal Approach................................
    public static Node LoopStartingPoint(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;
        Node node5 = new Node(5);
        node4.next = node5;

        // Make a loop from node5 to node2
        node5.next = node2;

        // Set the head of the linked list
        Node head = node1;

        // Detect the loop in the linked list
        System.out.println(LoopStartingPoint(head));
    }
}
