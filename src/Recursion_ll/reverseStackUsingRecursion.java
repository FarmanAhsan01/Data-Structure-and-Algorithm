package Recursion_ll;
import java.util.Stack;
public class reverseStackUsingRecursion {
    public static void insertAtBottom(Stack<Integer>stack,int x){
        if (stack.isEmpty()){
            stack.push(x);
            return;
        }
        int top=stack.pop();
        insertAtBottom(stack,x);
        stack.push(top);
    }
    public static void reverse(Stack<Integer>stack){
        if (stack.isEmpty()){
            return;
        }
        int top=stack.pop();
        reverse(stack);
        insertAtBottom(stack,top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        reverse(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}
