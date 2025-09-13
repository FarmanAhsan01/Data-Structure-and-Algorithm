package LinkedList;

public class sort0s1s2s {
    public static Node convertArr2LL(int arr[]){
        Node head=new Node(arr[0]);
        Node mover=head;
        for (int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
//    public static Node sort(Node head){
//        Node temp=head;
//        int cnt0=0;
//        int cnt1=0;
//        int cnt2=0;
//        while (temp!=null){
//            if (temp.data==0){
//                cnt0++;
//            }
//            else if (temp.data==1) {
//                cnt1++;
//            }
//            else {
//                cnt2++;
//            }
//            temp=temp.next;
//        }
//        temp=head;
//        while (temp!=null){
//            if(cnt0>0){
//                temp.data=0;
//                cnt0--;
//            }
//            else if (cnt1>0){
//                temp.data=1;
//                cnt1--;
//            }
//            else {
//                temp.data=2;
//                cnt2--;
//            }
//            temp=temp.next;
//        }
//        return head;
//    }
    public static Node sort(Node head){
        Node dummyNode0=new Node(-1);
        Node tail0=dummyNode0;
        Node dummyNode1=new Node(-1);
        Node tail1=dummyNode1;
        Node dummyNode2=new Node(-1);
        Node tail2=dummyNode2;
        Node temp=head;
        while (temp!=null){
            if (temp.data==0){
                tail0.next=temp;
                tail0=tail0.next;
            }
            else if (temp.data==1) {
                tail1.next=temp;
                tail1=tail1.next;
            }
            else {
                tail2.next=temp;
                tail2=tail2.next;
            }
            temp=temp.next;
        }
        tail0.next=(dummyNode1.next!=null)?dummyNode1.next:dummyNode2.next;
        tail1.next=dummyNode2.next;
        tail2.next =null;
        Node newHead=dummyNode0.next;
        return newHead;
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,2,0,2,1};
        Node head=convertArr2LL(arr);
        head=sort(head);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
