package Binary_Search_ll_Level;

import java.util.Arrays;

public class Aggressive_cows {
    //Brute Approach........................
//    public static int minDistCowMax(int nums[],int cows){
//        Arrays.sort(nums);
//        int n=nums.length;
//        int range=nums[n-1]-nums[0];
//
//        for (int i=1;i<range;i++){
//            if(canWePlace(nums,i,cows)==true){
//                continue;
//            }
//            else {
//                return i-1;
//            }
//        }
//        return -1;
//    }

    //Optimal Approach.....................................
    public static int minDistCowMax(int nums[],int cows){
        Arrays.sort(nums);
        int n=nums.length;
        int low=0;
        int high=nums[n-1]-nums[0];
        int ans=0;
       while(low<=high){
           int mid=(low+high)/2;
           if(canWePlace(nums,mid,cows)==true){
               ans=mid;
               low=mid+1;
           }
           else {
               high=mid-1;
           }
       }
       return ans;
    }

    public static boolean canWePlace(int nums[],int dist,int cows){
        int n=nums.length;
       int cntCows=1;
       int last=nums[0];
       for (int i=1;i<n;i++){
           if(nums[i]-last>=dist){
               cntCows++;
               last=nums[i];
           }
       }
       if (cntCows>=cows) return true;
       else return false;
    }
    public static void main(String[] args){
        int nums[]={0,3,4,7,9,10};
        int cows=4;
        System.out.println(minDistCowMax(nums,cows));
    }
}
