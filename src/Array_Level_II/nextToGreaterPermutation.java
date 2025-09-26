package Array_Level_II;

import java.util.*;

public class nextToGreaterPermutation {
    public static void reverseArray(int arr[] ,int start,int end) {
        int n=arr.length;
        if(start>=end){
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseArray(arr,start+1,end-1);
    }
    public static void nextPermutation(int[] nums){
        int n=nums.length;
        int ind=-1;
        for (int i=0;i<n-1;i++){
            if (nums[i]<nums[i+1]){
                ind=i;
            }
        }
        if (ind==-1){
            reverseArray(nums,0,n);
            return;
        }
        for (int i=n-1;i>ind;i--){
            if (nums[i]>nums[ind]){
               int temp=nums[i];
               nums[i]=nums[ind];
               nums[ind]=temp;
               break;
            }
        }
        reverseArray(nums,ind+1,n-1);
    }
    public static void main(String[] args) {
        int nums[]={2,1,5,4,3,0,0};
        int n=nums.length;
        nextPermutation(nums);
       for (int i=0;i<n;i++){
           System.out.print(nums[i]);
       }
    }
}
