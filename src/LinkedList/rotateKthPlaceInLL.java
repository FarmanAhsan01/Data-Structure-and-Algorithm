package LinkedList;

public class rotateKthPlaceInLL {
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
    public static Node findNthNode(Node head,int k){
        Node temp=head;
        while (k!=1){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public static Node rotateKTimes(Node head,int k){
            Node temp=head;
            int len=1;
        if (head == null || head.next == null || k == 0) {
            return head;
        }
            while(temp.next!=null){
                len=len+1;
                temp=temp.next;
            }
            if (k%len==0) return head;
            k=k%len;
            temp.next=head;
            Node newLastNode=findNthNode(head,len-k);
            head=newLastNode.next;
            newLastNode.next=null;
            return head;
    }

    public static void main(String[] args) {
        int arr[]={1,3,2,5};
        int k=2;
        Node head=convertArr2LL(arr);
        head=rotateKTimes(head,k);
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
