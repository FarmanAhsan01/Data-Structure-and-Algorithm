package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

class Nod{
    int data;
    Nod next;
    Nod child;
    Nod(int data1,Nod next1,Nod child1){
        this.data=data1;
        this.next=next1;
        this.child=child1;
    }
    Nod(int data1,Nod child1){
        this.data=data1;
        this.next=null;
        this.child=child1;
    }
    Nod(int data1){
        this.data=data1;
        this.next=null;
        this.child=null;
    }

}
public class flatteningOfLL {
//    Brute Approach................................

//    public static Nod convert(ArrayList<Integer>arr ){
//        if (arr.size()==0){
//            return null;
//        }
//        Nod dummyNode=new Nod(-1);
//        Nod temp=dummyNode;
//        for (int i=0;i<arr.size();i++){
//            temp.child=new Nod(arr.get(i));
//            temp=temp.child;
//        }
//        return dummyNode.child;
//    }
//    public static Nod Flattening(Nod head){
//        ArrayList<Integer>map=new ArrayList<>();
//        Nod temp=head;
//        while(temp!=null){
//            Nod t2=temp;
//            while (t2!=null){
//                map.add(t2.data);
//                t2=t2.child;
//            }
//            temp=temp.next;
//        }
//
//        Collections.sort(map);
//        head=convert(map);
//        return head;
//    }

//    Optimal Approach..................................................

    public static Nod merge2Lists(Nod list1,Nod list2){
        Nod dummyNode=new Nod(-1);
        Nod res=dummyNode;
        while (list1!=null && list2!=null){
            if (list1.data< list2.data){
                res.child=list1;
                res=list1;
                list1=list1.next;
            }
            else {
                res.child=list2;
                res=list2;
                list2=list2.child;
            }
            res.next=null;
        }
        if (list1!=null){
            res.child=list1;
        }
        else {
            res.child=list2;
        }
        return dummyNode.child;
    }
    public static Nod Flattening(Nod head){
        if (head==null||head.next==null){
            return head;
        }
        Nod mergedHead=Flattening(head.next);
        return merge2Lists(head,mergedHead);
    }
    
    static void printLinkedList(Nod head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
        System.out.println();
    }
    static void printOriginalLinkedList(Nod head, int depth) {
        while (head != null) {
            System.out.print(head.data);

            // If child exists, recursively
            // print it with indentation
            if (head.child != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.child, depth + 1);
            }

            // Add vertical bars
            // for each level in the grid
            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }
    public static void main(String[] args) {
        // Create a linked list with child pointers
        Nod head = new Nod(5);
        head.child = new Nod(14);

        head.next = new Nod(10);
        head.next.child = new Nod(4);

        head.next.next = new Nod(12);
        head.next.next.child = new Nod(20);
        head.next.next.child.child = new Nod(13);

        head.next.next.next = new Nod(7);
        head.next.next.next.child = new Nod(17);

        // Print the original
        // linked list structure
        System.out.println("Original linked list:");
        printOriginalLinkedList(head, 0);

        // Flatten the linked list
        // and print the flattened list
        Nod flattened = Flattening(head);
        System.out.println("\nFlattened linked list: ");
        printLinkedList(flattened);
    }
    }

