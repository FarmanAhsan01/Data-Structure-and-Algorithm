package Binary_Search_ll_Level;
import java.util.Arrays;
public class find_kth_missing_number {
    //Brute force ....................................................
//    public static int missingNumber(int nums[],int k){
//        int n=nums.length;
//        for(int i=0;i<=n-1;i++){
//            if(nums[i]<=k){
//                k++;
//            }
//            else{
//                break;
//            }
//        }
//        return k;
//    }

   // optimal Approach................................................
    public static int missingNumber(int nums[],int k){
        int n=nums.length;
        int low=0; int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int missing=nums[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low+k;
    }
    public static void main(String[] args){
        int nums[]={2,3,4,7,11};
        int k=5;
        System.out.println(missingNumber(nums,k));
    }

}
