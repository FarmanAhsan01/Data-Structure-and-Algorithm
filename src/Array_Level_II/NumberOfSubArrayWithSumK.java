package Array_Level_II;

import java.util.HashMap;

public class NumberOfSubArrayWithSumK {
    public static int findSuArrayWithGivenSum(int arr[],int k){
        int n=arr.length;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int preSum=0,count=0;
        mpp.put(0,1);
        for (int i=0;i<n;i++) {
            preSum += arr[i];

            int remove = preSum - k;
            count += mpp.getOrDefault(remove, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,-3,1,1,1,4,2,-3};
        int k=3;
        System.out.println(findSuArrayWithGivenSum(arr,k));
    }
}
