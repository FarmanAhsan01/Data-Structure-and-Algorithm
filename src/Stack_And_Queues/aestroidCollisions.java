package Stack_And_Queues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class aestroidCollisions {
    public static List<Integer> collision(int arr[]){
        int n=arr.length;
//        Stack<Integer>=new Stack<>();
        List<Integer>st=new ArrayList<>();
        for (int i=0;i<n;i++){
            if (arr[i]>0){
                st.add(arr[i]);
            }
            else {
                while(!st.isEmpty()
                        && st.get(st.size()-1)>0
                        && st.get(st.size()-1)< -arr[i]){
                    st.remove(st.size()-1);
                }
                if (!st.isEmpty() && st.get(st.size()-1) == -arr[i])    {
                    st.remove(st.size()-1);
                }
                else if (st.isEmpty() || st.get(st.size()-1) < 0) {
                    st.add(arr[i]);
                }
            }
        }
        return st;
    }
    public static void main(String[] args) {
        int arr[]={4,7,1,1,2,-3,-7,17,15,-16};
        System.out.println(collision(arr));
    }
}
