package Stack_And_Queues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class sumOfSubArrayRanges {

    //Brute Approach.........................................
//    public static int subArrayRanges(int arr[]){
//        int sum=0;
//        int n=arr.length;
//        for (int i=0;i<n;i++){
//            int largest=arr[i];
//            int smallest=arr[i];
//            for (int j=i+1;j<n;j++){
//                largest=Math.max(largest,arr[j]);
//                smallest=Math.min(smallest,arr[j]);
//                 sum=sum+(largest-smallest);
//            }
//        }
//        return sum;
//    }

    //optimal approach....................................
    public static List<Integer> findNSE(int arr[]) {
        int n = arr.length;
        List<Integer> nse = new ArrayList<>(Collections.nCopies(n, n));
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
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

    public static long sumSubarrayMins(int arr[]) {
        int n = arr.length;
        List<Integer> nse = findNSE(arr);
        List<Integer> pse = findPSE(arr);

        long sum = 0;
        for (int i = 0; i < n; i++) {
            long left = i - pse.get(i);
            long right = nse.get(i) - i;
            sum += left * right * arr[i];
        }
        return sum;
    }

    public static long sumSubarrayMaxs(int arr[]) {
        int n = arr.length;
        List<Integer> nge = new ArrayList<>(Collections.nCopies(n, n));
        List<Integer> pge = new ArrayList<>(Collections.nCopies(n, -1));
        Stack<Integer> st = new Stack<>();

        // Next Greater
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                nge.set(st.pop(), i);
            }
            st.push(i);
        }

        st.clear();

        // Previous Greater
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            pge.set(i, st.isEmpty() ? -1 : st.peek());
            st.push(i);
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            long left = i - pge.get(i);
            long right = nge.get(i) - i;
            sum += left * right * arr[i];
        }
        return sum;
    }
    public static long subArrayRanges(int arr[]){
       return sumSubarrayMaxs(arr)-sumSubarrayMins(arr);

    }
    public static void main(String[] args) {
        int arr[]={1,4,3,2};
        System.out.println(subArrayRanges(arr));
    }
}
