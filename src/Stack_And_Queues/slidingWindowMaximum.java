package Stack_And_Queues;

import java.util.*;

public class slidingWindowMaximum {

    //Brute Approach..............................................
//    public static List<Integer> maxWindow(int arr[],int k){
//        int n=arr.length;
//        List<Integer>ls=new ArrayList<>();
//        for (int i=0;i<=n-k;i++){
//            int maxi=arr[i];
//            for (int j=i;j<i+k;j++){
//                maxi=Math.max(maxi,arr[j]);
//            }
//            ls.add(maxi);
//        }
//        return ls;
//    }

    //Optimal Approach....................................
    public static List<Integer> maxWindow(int arr[], int k){
        int n=arr.length;
        Deque<Integer>dq=new LinkedList<>();
        List<Integer>ls=new ArrayList<>();
        for (int i=0;i<n;i++){
            //maintaining decreasing order remo
            if (!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            //remove smaller values from back of deque
            while(!dq.isEmpty() && arr[dq.peekLast()]<arr[i]){
                dq.pollLast();
            }
            dq.offerLast(i);

            if (i>=k-1){
                ls.add(arr[dq.peekFirst()]);
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,2,1,6};
        int k=3;
        System.out.println(maxWindow(arr,k));
    }
}
