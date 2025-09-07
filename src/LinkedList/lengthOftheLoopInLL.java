package LinkedList;

import java.util.HashMap;

public class lengthOftheLoopInLL {

//    Brute Approach...................................
//    public static int loopLength(Node head){
//        if (head == null){
//            return 0;
//        }
//        Node temp = head;
//        int timer=0;
//        HashMap<Node,Integer> map = new HashMap<>();
//        while (temp != null) {
//            if (map.containsKey(temp)) {
//                int value=timer-map.get(temp);
//                return value;
//            }
//            map.put(temp, timer);
//            timer++;
//            temp = temp.next;
//        }
//
//        return 0;
//    }

//    Optimal Approach..............................
    public static int cntLengthLoop(Node slow,Node fast){
        int cnt=0;
        while (fast!=null){
            fast=fast.next;
            cnt++;
            if (slow==fast){
                return cnt;
            }
        }
        return 0;
    }

    public static int loopLength(Node head){
        Node slow=head;
        Node fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return cntLengthLoop(slow,fast);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Create a loop from fifth to second
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // This creates a loop
        fifth.next = second;

        System.out.println( loopLength(head));
    }
}
