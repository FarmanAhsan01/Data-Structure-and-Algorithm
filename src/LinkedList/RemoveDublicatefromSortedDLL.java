package LinkedList;

public class RemoveDublicatefromSortedDLL {
    public static Nodes convert2DLL(int arr[]){
        Nodes head=new Nodes(arr[0]);
        Nodes prev=head;

        for (int i=1;i<arr.length;i++){
            Nodes temp=new Nodes(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    public static Nodes removeDublicate(Nodes head){
//        if (head==null ||head.next!=head){
//            return head;
//        }
        Nodes temp=head;
       while (temp!=null && temp.next!=null){
            Nodes nextNode=temp.next;
            while (nextNode!=null && nextNode.data==temp.data){
                nextNode=nextNode.next;
            }
            temp.next=nextNode;
            if (nextNode!=null){
                nextNode.back=temp;
            }
            temp=temp.next;

        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,4,5,5};
        int key=10;

        Nodes head=convert2DLL(arr);
        head=removeDublicate(head);

        Nodes temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
