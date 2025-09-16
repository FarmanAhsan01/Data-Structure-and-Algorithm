package LinkedList;

public class add2NumberInLL {
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
    public static Node add2LL(Node head1,Node head2){
         Node temp1=head1;
         Node temp2=head2;
         Node dummyNode=new Node(-1);
         int sum=0;
         int carry=0;
         Node current=dummyNode;
         while (temp1!=null||temp2!=null){
             sum=carry;
             sum=sum+temp1.data;
             sum=sum+temp2.data;
             Node newNode=new Node(sum%10);
             carry=sum/10;
             current.next=newNode;
             current=current.next;
             if (temp1!=null){
                 temp1=temp1.next;
             }
             if (temp2!=null){
                 temp2=temp2.next;
             }
         }
         if (carry==1){
             Node newNode=new Node(carry);
             current.next=newNode;
         }
         return dummyNode.next;
    }
    public static void main(String[] args) {
        int arr[]={2,4,3};
        int arr2[]={5,6,4};
        Node head1=convertArr2LL(arr);
        Node head2=convertArr2LL(arr2);
        Node head=add2LL(head1,head2);
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
