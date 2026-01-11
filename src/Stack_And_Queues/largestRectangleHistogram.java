package Stack_And_Queues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class largestRectangleHistogram {
    public static List<Integer>findNSE(int arr[]){
        int n=arr.length;
        List<Integer>nse=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for (int i = 0; i < n; i++) {
            nse.add(n);
        }
        for (int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                nse.set(st.pop(), i);
            }
            st.push(i);
        }
        return nse;
    }
    public static List<Integer> findPSE(int arr[]) {
        int n = arr.length;
        List<Integer> pse = new ArrayList<>(Collections.nCopies(n, -1));
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            pse.set(i, st.isEmpty() ? -1 : st.peek());
            st.push(i);
        }
        return pse;
    }
    public static int largestRectangle(int arr[]){
        int n=arr.length;
        List<Integer>nse=findNSE(arr);
        List<Integer>pse=findPSE(arr);
        int maxi=0;
        for (int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]*(nse.get(i)-pse.get(i)-1));
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3, 1};
        System.out.println(largestRectangle(arr));
    }
}
