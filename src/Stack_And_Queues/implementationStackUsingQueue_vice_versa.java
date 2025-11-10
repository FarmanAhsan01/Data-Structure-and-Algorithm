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
    Stack<Integer> s1,s2=new Stack<>();
    void push(int x){
        while (s1.size()){
            s2.push(s1.peek());
            s1.pop();
        }
        s1.push(x);
        while (s2.size()){
            s1.push(s2.peek());
            s2.pop();
        }
    }
    void top(){
        s1.peek();
    }
    void pop(){
        s1.pop();
    }
    void printQueue(){

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

    }
}
