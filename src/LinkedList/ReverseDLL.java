package LinkedList;

import java.util.Stack;

public class ReverseDLL {
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
    //Brute Approach...................
//    public static Nodes reverseDLL(Nodes head){
//        Nodes temp=head;
//        Stack<Integer>stack=new Stack<>();
//        while(temp!=null){
//            stack.push(temp.data);
//            temp=temp.next;
//        }
//        temp=head;
//        while(temp!=null){
//            temp.data=stack.pop();
//            temp=temp.next;
//        }
//        return head;
//    }
//    Optimal Approach..............................
    public static Nodes reverseDLL(Nodes head){
        if (head==null ||head.next==null){
            return head;
        }
        Nodes last=null;
        Nodes current=head;
        while(current!=null){
            last=current.back;
           current.back=current.next;
           current.next=last;
           current=current.back;
        }
        return last.back;
    }

    public static void main(String[] args) {
        int arr[]={1,3,2,5};
        Nodes head=convert2DLL(arr);
        head=reverseDLL(head);
        Nodes temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
