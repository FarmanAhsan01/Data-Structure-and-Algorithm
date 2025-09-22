package LinkedList;

import java.util.HashMap;

class Nodess{
    int data;
    Nodess next;
    Nodess random;
    Nodess(int data1 ,Nodess next1,Nodess random1) {
        this.data=data1;
        this.next=next1;
        this.random=random1;
    }
    Nodess(int data1) {
         this.data=data1;
        this.next=null;
        this.random=null;
    }
}
public class cloneLinkedListWithRandomandNextPointer {
//    Brute Approach...................................................

//    public static Nodess cloneLinkedList(Nodess head){
//        Nodess temp=head;
//
//        HashMap<Nodess,Nodess>map=new HashMap<>();
//        while (temp!=null){
//            map.put(temp,new Nodess(temp.data));
//            temp=temp.next;
//        }
//        temp=head;
//        while (temp!=null){
//            Nodess copyNode=map.get(temp);
//            copyNode.next=map.get(temp.next);
//            copyNode.random=map.get(temp.random);
//            temp=temp.next;
//        }
//        return map.get(head);
//    }

    //OptimalApproach.............................................
    public static void insertCopyInBetween(Nodess head){
        Nodess temp=head;
        while (temp!=null){
            Nodess copyNode=new Nodess(temp.data);
            copyNode.next=temp.next;
            temp.next=copyNode;
            temp=temp.next.next;
        }
    }

    public static void conect(Nodess head){
        Nodess temp=head;
        while (temp!=null){
            Nodess  copyNodes=temp.next;
            if (temp.random!=null){
                copyNodes.random=temp.random.next;
            }
            else {
                copyNodes.random=null;

            }
            temp=temp.next.next;
        }
    }
    public static Nodess getDeepCopyList(Nodess head){
        Nodess temp=head;
        Nodess dummyNode=new Nodess(-1);
        Nodess res=dummyNode;
        while (temp!=null){
            res.next=temp.next;
            res=res.next;

            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dummyNode.next;
    }
    public static Nodess cloneLL(Nodess head){
        insertCopyInBetween(head);
        conect(head);
        return getDeepCopyList(head);
    }
    public static void printClonedLinkedList(Nodess head) {
        while (head != null) {
            System.out.print("Data: " + head.data);
            if (head.random != null) {
                System.out.print(", Random: " + head.random.data);
            } else {
                System.out.print(", Random: nullptr");
            }
            System.out.println();
            // Move to the next node in the list
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Nodess head = new Nodess(7);
        head.next = new Nodess(14);
        head.next.next = new Nodess(21);
        head.next.next.next = new Nodess(28);

        // Assigning random pointers
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next;
        head.next.next.next.random = head.next;

        System.out.println("Original Linked List with Random Pointers:");
        printClonedLinkedList(head);

        // Clone the linked list
        Nodess clonedList = cloneLL(head);

        System.out.println("\nCloned Linked List with Random Pointers:");
        printClonedLinkedList(clonedList);
    }
}
