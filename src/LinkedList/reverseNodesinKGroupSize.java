package LinkedList;

public class reverseNodesinKGroupSize {
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
    public static Node reverseLinkedList(Node head){
        Node temp=head;
        Node prev=null;
        while (temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public static Node kthNode(Node head,int k){
        Node temp=head;
        int cnt=k;
        while(temp!=null){
            cnt--;
            if (cnt==0){
                break;
            }
            temp=temp.next;
        }
        return temp;
    }
    public static Node reverseKgroup(Node head,int k){
        Node temp=head;
        Node prevLast=null;
        while(temp!=null){
            Node kNode=kthNode(temp,k);
            if (kNode==null){
                if (prevLast!=null)  prevLast.next=temp;
                break;
            }
            Node nextNode = kNode.next;
            kNode.next=null;
            reverseLinkedList(temp);

            if (temp==head){
                head=kNode;
            }
            else{
                prevLast.next=kNode;
            }
            prevLast=temp;
            temp=nextNode;

        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,5};
        int k=2;
        Node head=convertArr2LL(arr);
        head=reverseKgroup(head,k);
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
