package LinkedList;

public class deleteNodeFromLast {

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
    //Brute Approach...........................
//    public static Node removeNode(Node head,int n){
//        int cnt=0;
//        Node temp=head;
//        while (temp!=null){
//            cnt++;
//            temp=temp.next;
//        }
//        if (cnt==n){
//            Node newHead=head.next;
//            return newHead;
//        }
//        int res=cnt-n;
//        temp=head;
//        while (temp!=null){
//            res--;
//            if (res==0){
//                break;
//            }
//            temp=temp.next;
//        }
//        temp.next=temp.next.next;
//        return head;
//    }

        //   Optimal Approach .........................

    public static Node removeNode(Node head, int n){
        if (head == null) return null;
        Node fast=head;
        for (int i=0;i<n;i++){
            fast=fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        Node slow=head;
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }


        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,4,6,7,9,4};
        int n=6;
        Node head=ArrayToLinkedList(arr);
        head=removeNode(head,n);
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
