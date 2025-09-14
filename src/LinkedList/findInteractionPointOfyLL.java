package LinkedList;

import java.util.HashMap;

public class findInteractionPointOfyLL {

    static Node insertNode(Node head,int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;
        while(temp.next != null) temp = temp.next;

        temp.next = newNode;
        return head;
    }

//    Brute Approach............................................


//    public static Node findInteractionPoint(Node head1,Node head2){
//        Node temp = head1;
//        HashMap<Node,Integer> map = new HashMap<>();
//
//        while (temp != null){
//            map.put(temp, 1);
//            temp = temp.next;
//        }
//
//        Node temp2 = head2;
//        while (temp2 != null){
//            if (map.containsKey(temp2)){
//                return temp2;
//            }
//            temp2 = temp2.next;
//        }
//        return null;
//    }

//    Brute Approach(2)............................................
//    public  static Node collisionPoint(Node t1,Node t2,int d){
//        while (d!=0){
//            d--;
//            t2=t2.next;
//        }
//        while (t1!=t2){
//            t1=t1.next;
//            t2=t2.next;
//        }
//        return t1;
//    }
//    public static Node findInteractionPoint(Node headA,Node headB){
//        Node temp=headA;
//        int cntA=0;
//        int cntB=0;
//        while (temp!=null){
//            cntA++;
//            temp=temp.next;
//        }
//        temp=headB;
//        while (temp!=null){
//            cntB++;
//            temp=temp.next;
//        }
//        if (cntA<cntB){
//            return collisionPoint(headA,headB,cntB-cntA);
//        }
//        else {
//            return collisionPoint(headB,headA,cntA-cntB);
//        }
//    }

//    Optimal Approach......................................
    public static Node findInteractionPoint(Node headA,Node headB){
        Node tempA=headA;
        Node tempB=headB;
        while (tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
            if(tempA==tempB){
                return tempA;
            }
            if (tempA==null){
                tempA=headB;
            }
            if (tempB==null){
                tempB=headA;
            }
        }
        return tempA;
    }
    static void printList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertNode(head,1);
        head = insertNode(head,3);
        head = insertNode(head,1);
        head = insertNode(head,2);
        head = insertNode(head,4);

        Node head1 = head;

        head = head.next.next.next; // intersection starts here

        Node headSec = null;
        headSec = insertNode(headSec,3);
        Node head2 = headSec;
        headSec.next = head;

        // printing lists
        System.out.print("List1: "); printList(head1);
        System.out.print("List2: "); printList(head2);

        // finding intersection
        Node answerNode = findInteractionPoint(head1,head2);
        if(answerNode == null)
            System.out.println("No intersection\n");
        else
            System.out.println("The intersection point is " + answerNode.data);
    }
}
