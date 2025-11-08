package Stack_And_Queues;
//implement stack operation push ,pop and top

class st{
    int top=-1;
    int st[]=new int[10];
    void push(int x){
        if (top>=10){
            return;
        }
        top=top+1;
        st[top]=x;
    }
    int top(){
        if (top==-1){
           return -1;
        }
        return st[top];
    }
     void pop(){
        if (top==-1){
            return;
        }
        top=top-1;
     }
     int size(){
        return top+1;
     }
    void printStack() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.print("Stack Elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(st[i] + " ");
        }
        System.out.println();
    }
}
class queue{
    int size=10;
    int queues[]=new int[size];
    int currSize=0;
    int start=-1;
    int end=-1;

    void push(int x){
        if (currSize==size){
            return;
        }
        if (currSize==0){
            start=0;
            end=0;
            queues[end]=x;
        }
        else {
            end=(end+1)%size;
            queues[end]=x;
        }
        currSize+=1;
    }
    void pop(){
        if (currSize==0){
            return;
        }
        if (currSize==1){
            start=-1;
            end=-1;
        }
        else {
            start=(start+1)%size;
        }
        currSize-=1;
    }
    int top(){
        if (currSize==0){
            return -1;
        }
        return queues[start];
    }
    int size(){
        return currSize;
    }
    void printQueue() {
        if (currSize == 0) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.print("Queue Elements: ");
        int i = start;
        for (int count = 0; count < currSize; count++) {
            System.out.print(queues[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class IntroductionOfStackAndQueues {
//    public static st stack(int arr[]){
//        st s=new st();
//        s.push(5);
//        s.push(10);
//        s.push(15);
//        s.pop();
//
//        return s;
//    }
    public static queue queues(int arr[]){
        queue s=new queue();
        s.push(5);
        s.push(10);
        s.push(15);
        s.pop();
        return s;
    }
    public static void main(String[] args) {

        //stack
//        int arr[] = new int[10];
//        st s=stack(arr);
//        s.printStack();
//        System.out.println(s.top());
//        System.out.println(s.size());

        //queue
        int arr[]=new int[10];
        queue s=queues(arr);
        s.printQueue();
        System.out.println(s.top());
        System.out.println(s.size());
    }

}
