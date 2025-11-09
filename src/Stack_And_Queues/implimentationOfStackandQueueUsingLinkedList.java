package Stack_And_Queues;


class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};

class stack{
    Node top=null;
    int size=0;
    void push(int x){
        Node temp=new Node(x);
        temp.next=top;
        top=temp;
        size=size+1;
    }
    void pop(){
        if (top==null) {
            return;
        }
        top=top.next;
        size=size-1;
    }
    int top(){
        if (top==null) {
            System.out.println("stack is empty");
        }
        return top.data;
    }
    int size(){
        return size;
    }

    void printStack(){
        if (top==null){
            return;
        }
       Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}

class qu{
    Node start=null;
    Node end=null;
    int size=0;
    void push(int x){
        Node temp=new Node(x);
        if(start==null && end==null){
            start=temp;
           end=temp;
        }
        else {
            end.next=temp;
            end=temp;
        }
        size+=1;
    }
    void pop(){
        start=start.next;
        size-=1;
    }
    int top(){
        return start.data;
    }

    int size(){
        return size;
    }

    void printQueue(){
        if (start==null){
            return;
        }
        Node temp=start;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}

public class implimentationOfStackandQueueUsingLinkedList {
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
    //stack function ...........................................
//    public static stack stacks(Node head){
//        stack st=new stack();
//        st.push(5);
//        st.push(6);
//        st.push(10);
//        st.pop();
//        System.out.println("top of the stack "+st.top());
//        System.out.println("size of the stack "+st.size());
//        return st;
//    }

    //Queue function ...........................................

    public static qu queue(Node head){
        qu Q=new qu();
        Q.push(5);
        Q.push(7);
        Q.push(9);
        Q.pop();
        System.out.println("top element of the queue "+Q.top());
        System.out.println("size of the queue "+Q.size());
        return Q;
    }
    public static void main(String[] args) {
        int arr[]=new int[10];
        Node head=convertArr2LL(arr);
        //for stack.................
//        stack st=stacks(head);
//        st.printStack();

        //for queue.....................
        qu Q=queue(head);
        Q.printQueue();



    }
}
