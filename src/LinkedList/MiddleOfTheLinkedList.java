package LinkedList;

public class MiddleOfTheLinkedList {

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
    //Brute Approach....................
//    public static Node MidLinkedList(Node head){
//        Node temp=head;
//        int cnt=0;
//        while(temp!=null){
//            cnt++;
//            temp=temp.next;
//        }
//
//        int mid=(cnt/2+1);
//         temp=head;
//        while (temp != null) {
//           mid--;
//           if (mid==0){
//               break;
//           }
//           temp=temp.next;
//        }
//        return temp;
//    }

    //Optimal Approach.........................

    public static Node MidLinkedList(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int arr[]={1,5,6,8,4,0,9};
        Node head=convertArr2LL(arr);
        Node temp=MidLinkedList(head);
        System.out.println(temp.data);
    }
}
