package LinkedList;

public class deleteAllOccurenceOfaKeyinDLL {
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
    public static Nodes deleteKeys(Nodes head,int key){
        Nodes temp=head;

        while (temp!=null){
            Nodes prev=temp.back;
            Nodes front=temp.next;
            if (head.data==key){
                if (head!=null){
                    head=head.next;
                    head.back=null;
                }
                temp=head;
                continue;
            }

             if (temp.data==key){
                 prev.next=front;
                if (front!=null){
                    front.back=prev;
                }
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={10,4,10,10,6,10};
        int key=10;

        Nodes head=convert2DLL(arr);
        head=deleteKeys(head,key);

        Nodes temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
