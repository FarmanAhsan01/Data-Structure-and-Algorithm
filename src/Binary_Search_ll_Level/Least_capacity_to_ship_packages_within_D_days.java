package Binary_Search_ll_Level;

public class Least_capacity_to_ship_packages_within_D_days {
    public static int sum(int nums[]){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public static int max(int nums[]){
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
           maxi= Math.max(maxi,nums[i]);
        }
        return maxi;
    }
    public static int fun(int nums[],int cap){
        int n=nums.length;
        int day=1;int load=0;
        for (int i=0;i<n;i++){
            if (load+nums[i]>cap){
                day=day+1;
                load=nums[i];
            }
            else {
                load+=nums[i];
            }
        }
        return day;
    }
    //brute approach........................................

//    public static int LeastCapacity(int nums[],int days){
//        for (int cap=max(nums);cap<=sum(nums);cap++){
//            int daysReq=fun(nums,cap);
//            if (daysReq<=days){
//                return cap;
//            }
//        }
//        return -1;
//    }

    //Optimal Approach..................................
    public static int LeastCapacity(int nums[],int days){
        int n=nums.length;
        int low=max(nums);int high=sum(nums);
        while(low<=high){
            int mid=(low+high)/2;
            int numbersOfDays=fun(nums,mid);
            if (numbersOfDays<=days){
                high = mid - 1;
            } else {
                //eliminate left half
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(LeastCapacity(nums,days));
    }

}
