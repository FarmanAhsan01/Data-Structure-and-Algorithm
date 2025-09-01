package LinkedList;

import java.io.PrintStream;

class Nodes{
    int data;
    Nodes next;
    Nodes back;

    Nodes(int data1, Nodes next1,Nodes back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }
    Nodes(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }
};

public class DoublyLinkedList {
    //convertArr2Dll
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
    //length of Doubly LinkedList.............

    public static int lengthOfDLL(Nodes head){
        int cnt=0;
        Nodes temp=head;
        while (temp != null) {
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }

//    Deletion of Doubly LinkedList

    //Delete head of Linked List
    public static Nodes headOfDLL(Nodes head){
        Nodes prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;

        return head;
    }
    //delete tail of the list
    public static Nodes tailOfDLL(Nodes head){
        Nodes tail=head;

        while(tail.next!=null){
            tail=tail.next;
        }
        Nodes prev=tail.back;
        prev.next=null;
        tail.back=null;


        return head;
    }

    //delete kth element of the list

    public static Nodes kthElementOfDLList(Nodes head, int k){
        Nodes temp=head;
        int cnt=0;

        while (temp!=null){
            cnt++;
            if (cnt==k){
              break;
            }
            temp=temp.next;
        }
        Nodes prev=temp.back;
        Nodes front=temp.next;

        if (prev==null && front ==null){
            return null;
        }
        else if(prev==null){
            return headOfDLL(head);
        }
        else if (front==null) {
            return tailOfDLL(head);
        }
        prev.next=front;
        front.back=prev;
        temp.next=null;
        temp.back=null;

        return head;
    }
    public static void deleteNode(Nodes temp){
        Nodes prev=temp.back;
        Nodes front=temp.next;

        if (front==null){
            prev.next=null;
            temp.back=null;
            return;
        }
        prev.next=front;
        front.back=prev;

        temp.next=temp.back=null;

    }


    public static void main(String[] args) {
        int arr[]={1,5,6,8};
        int k=1;

        Nodes head=convert2DLL(arr);
//        head=headOfDLL(head);
//        head=tailOfDLL(head);
//        head=kthElementOfDLList(head,k);
            deleteNode(head.next.next);
//        System.out.println(lengthOfDLL(head));
        Nodes temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
