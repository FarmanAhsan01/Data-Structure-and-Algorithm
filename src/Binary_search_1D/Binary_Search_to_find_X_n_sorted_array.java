package Binary_search_1D;

import java.rmi.dgc.VMID;

public class Binary_Search_to_find_X_n_sorted_array {
//    public static int search(int[] nums,int target){
//        int n= nums.length;
//        int low=0;
//        int high=n-1;
//        while(low<=high){
//            int mid=(low+high)/2;
//            if (nums[mid]==target){
//                return mid;
//            } else if (target<nums[mid]) {
//                high=mid-1;
//            }
//            else {
//                low=mid+1;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int nums[]={3,4,6,7,9,12,16,17};
//        int target=6;
//        System.out.println(search(nums,target));
//    }

    //using recursion...............................................................
    public static int search(int nums[],int low,int high,int target){
        if (low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if (nums[mid]==target){
            return mid;
        }
        else if (nums[mid]<target){
           return search(nums,mid+1,high,target);
        }
        else {
          return search( nums,low,mid-1,target);
        }
    }

    public static void main(String[] args) {
        int nums[]={3,4,6,7,9,12,16,17};
        int n=nums.length;
        int low=0;
        int high=n-1;
        int target=6;
        System.out.println(search(nums,low,high,target));
    }
}
