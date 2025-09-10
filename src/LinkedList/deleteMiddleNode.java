package LinkedList;

public class deleteMiddleNode {
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

    //Brute Approach...............................
//    public static Node removeMiddleNode(Node head){
//        if (head==null||head.next==null){
//            return null;
//        }
//        Node temp=head;
//        int cnt=0;
//        while (temp!=null){
//            cnt++;
//            temp=temp.next;
//        }
//        int mid=cnt/2;
//        temp=head;
//        while (temp!=null){
//            if (mid==1){
//               temp.next=temp.next.next;
//            }
//            mid--;
//            temp=temp.next;
//        }
//        return head;
//    }

//    Optimal Approach..............................
    public static Node removeMiddleNode(Node head){
        if (head==null||head.next==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        while (fast.next != null && fast.next.next != null && fast.next.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,7,1,2};
        Node head=convertArr2LL(arr);
        head=removeMiddleNode(head);
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
