package Stack_And_Queues;
import java.util.*;
class stacks{
    Queue<Integer>que=new LinkedList<>();
    void push(int x){
        int s= que.size();
        que.add(x);

        for (int i=0;i<s;i++){
            que.add(que.peek());
            que.remove();
        }
    }
    void pop(){
        que.remove();
    }
    int top(){
        return que.peek();
    }
    void printStack(){
        if (que.isEmpty()){
            return;
        }
        for (int val:que){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}

class queues{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    void push(int x){
        while (!s1.isEmpty()){
            s2.push(s1.pop());

        }
        s1.push(x);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    int top(){
        return s1.peek();
    }
    void pop(){
        s1.pop();
    }
    void printQueue(){
        if (s1.isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int val : s1) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

public class implementationStackUsingQueue_vice_versa {
//    public static stacks st(){
        //implement stack using queue..........
//        stacks s=new stacks();
//        s.push(10);
//        s.push(20);
//        s.push(30);
//
//        return s;
//       }

        //implement queue using stack...............
    public static queues que(){
        queues s=new queues();
        s.push(10);
        s.push(20);
        s.push(30);
        return s;
    }


    public static void main(String[] args) {
//        Stack.............................
//        stacks s=st();
//        s.printStack();
//        s.pop();
//        s.printStack();
//        System.out.println(s.top());

//        queue........................
        queues s=que();
        s.printQueue();               // Prints initial queue
        System.out.println("Top = " + s.top());

        s.pop();
        System.out.println("After one pop:");
        s.printQueue();

        s.push(40);
        System.out.println("After pushing 40:");
        s.printQueue();

    }
}
