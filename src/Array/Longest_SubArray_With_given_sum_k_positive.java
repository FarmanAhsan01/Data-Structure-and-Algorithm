package Array;

import java.util.HashMap;

public class Longest_SubArray_With_given_sum_k_positive {
    //brute approach..................................
//    public static int logesSubarray(int arr[],int k){
//        int n=arr.length;
//        int len=0;
//        for (int i=0;i<n;i++){
//            int sum=0;
//            for (int j=i;j<n;j++){
////                int sum=0;
////                for (int h=i;h<=j;h++){
////                    sum+=arr[h];
////                }
//                //second better approach
//                sum+=arr[j];
//                if (sum==k){
//                    len=Math.max(len,j-i+1);
//                }
//            }
//        }
//        return len;
//    }
//    public static void main(String[] args) {
//        int arr[]={94 ,-33 ,-13, 40, -82, 94, -33, -13,40 ,-82};
//        int k=52;
//        System.out.println(logesSubarray(arr,k));
//    }

    //better approach for positive and Optimal Approach for Positive and negative.............................................................
    public static int largeSubArray(int arr[],int k){
        HashMap<Integer,Integer>l1=new HashMap<>();
        int n=arr.length;
        int sum=0;
        int maxlen=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if (sum==k){
                Math.max(maxlen,i+1);
            }
            int rem=sum-k;
           if (l1.containsKey(rem)){
               int len=i-l1.get(rem);
               maxlen=Math.max(maxlen,len);
           }
           if (!l1.containsKey(sum)){
               l1.put(sum,i);
           }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int arr[]={94 ,-33 ,-13, 40, -82, 94, -33, -13,40 ,-82};
        int k=52;
        System.out.println(largeSubArray(arr,k));
    }

    //optimal approach...................................................
    //for positive
//    public static int largeSubArray(int arr[],int k){
//        int n = arr.length; // size of the array.
//
//        int left = 0, right = 0; // 2 pointers
//        long sum = arr[0];
//        int maxLen = 0;
//        while (right < n) {
//            // if sum > k, reduce the subarray from left
//            // until sum becomes less or equal to k:
//            while (left <= right && sum > k) {
//                sum -= arr[left];
//                left++;
//            }
//
//            // if sum = k, update the maxLen i.e. answer:
//            if (sum == k) {
//                maxLen = Math.max(maxLen, right - left + 1);
//            }
//
//            // Move forward thw right pointer:
//            right++;
//            if (right < n) sum += arr[right];
//        }
//
//        return maxLen;
//    }
//
//    public static void main(String[] args) {
//        int arr[]={1,2,3,1,1,1,1,3,3};
//        int k=6;
//        System.out.println(largeSubArray(arr,k));
//    }
}
