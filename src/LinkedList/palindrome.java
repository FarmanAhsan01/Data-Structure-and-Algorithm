package LinkedList;

import java.util.Stack;

public class palindrome {
//    public static boolean isPalindrome(Node head){
//        Node temp=head;
//        Stack<Integer>st=new Stack<>();
//        while (temp!=null){
//            st.push(temp.data);
//            temp=temp.next;
//        }
//        temp=head;
//        while (temp!=null){
//            if (temp.data!=st.peek()){
//                return false;
//            }
//            st.pop();
//            temp=temp.next;
//        }
//        return true;
//    }

    public static Node reverse(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node temp=head;
        Node prev = null;
        while (temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public static boolean isPalindrome(Node head){
        Node slow=head;
        Node fast=head;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node newHead=reverse(slow.next);
        Node first=head;
        Node second=newHead;
        while(second!=null){
            if (first.data!=second.data){
                reverse(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverse(newHead);
        return true;
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);
        System.out.println(isPalindrome(head));

   }
}
