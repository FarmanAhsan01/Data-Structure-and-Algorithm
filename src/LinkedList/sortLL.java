package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class sortLL {
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
//    Brute Approach...........................

//    public static Node sort(Node head){
//        ArrayList<Integer>arr=new ArrayList<>();
//       Node temp=head;
//       while (temp!=null){
//           arr.add(temp.data);
//           temp=temp.next;
//       }
//        Collections.sort(arr);
//       int i=0;
//       temp=head;
//       while (temp!=null){
//           temp.data=arr.get(i);
//           i++;
//           temp=temp.next;
//       }
//       return head;
//    }

//    Optimal Approach..................................
    public static Node findMiddle(Node head){
        Node slow=head;
        Node fast=head.next;
        while (fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node list1, Node list2){
        Node dummyNode=new Node(-1);
        Node temp=dummyNode;

        while (list1!=null &&list2!=null){
            if (list1.data<list2.data){
                temp.next=list1;
                list1=list1.next;
            }
            else {
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if (list1!=null){
            temp.next=list1;
        }
        else {
            temp.next=list2;
        }

        return dummyNode.next;
    }
    public static Node sort(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node middle=findMiddle(head);
        Node leftHead=head;
        Node rightHead=middle.next;
        middle.next=null;

        leftHead=sort(leftHead);
        rightHead=sort(rightHead);
        return merge(leftHead,rightHead);

    }
    public static void main(String[] args) {
        int arr[]={4,5,7,0,9,10,1};
        Node head=convertArr2LL(arr);
        head=sort(head);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
