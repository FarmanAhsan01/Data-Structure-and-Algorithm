package Binary_search_1D;

import java.lang.annotation.Target;

public class find_first_last_occurrance_in_the_Array {
    public static int LowerBound(int nums[],int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
    public static int UpperBound(int nums[],int target){
        int n=nums.length;
        int ans=-1;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (nums[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans == -1 ? nums.length : ans;
    }

    //to find the first and last occurrence of element......................
    public static int[] searchRange(int nums[],int target){
        int n=nums.length;
        int lb=LowerBound(nums,target);
        if (lb==-1||nums[lb]!=target){
            return new int[]{-1,-1};
        }
        return new int[]{lb,UpperBound(nums,target)-1};
    }
    //no of occurrence of the target............................................
    public static int noOfOccurrence(int arr[],int target){
        int n=arr.length;
        int ans[]=searchRange(arr,target);
        if (ans[0]==-1) return 0;
        return (ans[1]-ans[0]+1);
    }

    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target=8;
        int result=noOfOccurrence(nums,target);
        System.out.println(result);
    }
}
