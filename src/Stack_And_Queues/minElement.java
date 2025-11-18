package Stack_And_Queues;

import java.util.Stack;
class Pair{
    int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class minStack{
    Stack<Pair>st;
    public minStack(){
       st=new Stack<>();
    }
    public void push(int x){
        int min;
        if (st.isEmpty()){
            min=x;
        }
        else {
            min=Math.min(st.peek().y,x);
        }
        st.push(new Pair(x,min));
    }

    public void pop(){
        st.pop();
    }

    public int top(){
        return st.peek().x;
    }

    public int getMini(){
        return st.peek().y;
    }
}

//class minStack{
//    Stack<Integer>st=new Stack<>();
//    int mini=Integer.MAX_VALUE;
//    void push(int val){
//        if (st.isEmpty()){
//            mini=val;
//            st.push(val);
//        }
//        else {
//            if (val>mini) st.push(val);
//            else {
//                st.push(2*val-mini);
//                mini=val;
//            }
//        }
//    }
//    void pop(){
//        if(st.isEmpty()) return;
//        int x=st.pop();
//
//        if (x<mini){
//            mini=2*mini-x;
//        }
//    }
//    int top(){
//        if (st.isEmpty()) return -1;
//        int x=st.peek();
//        if (mini<x) return x;
//        return mini;
//    }
//    int getMini(){
//        return mini;
//    }
//}

public class minElement {
    public static minStack findMin(){
        minStack st=new minStack();
        st.push(4);
        st.push(5);
        st.push(3);
        st.push(6);

        return st;
    }

    public static void main(String[] args) {
        minStack st=findMin();
        System.out.println("Top: " + st.top());
        System.out.println("Min: " + st.getMini());

        st.pop();
        System.out.println("After Pop → Top: " + st.top());
        System.out.println("After Pop → Min: " + st.getMini());

        st.pop();
        System.out.println("After Pop → Top: " + st.top());
        System.out.println("After Pop → Min: " + st.getMini());
    }
}

