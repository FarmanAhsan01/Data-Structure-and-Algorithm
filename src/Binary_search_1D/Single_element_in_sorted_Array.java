package Binary_search_1D;

public class Single_element_in_sorted_Array {

    //Brute Approach.............................................
//    public static int singleNonDuplicate(int nums[]){
//        int n=nums.length;
//        if (n==1){
//            return 0;
//        }
//        if(nums[n-1]!=nums[n-2]){
//            return n-1;
//        }
//        if(nums[0]!=nums[1]){
//            return 0;
//        }
//        for (int i=1;i<n-1;i++){
//            if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]){
//                return i;
//            }
//        }
//        return -1;
//
//    }
    //Optimal Approach ..........................................................
    public static int singleNonDuplicate(int nums[] ){
        int n=nums.length;
        if (n==1){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        if (nums[0]!=nums[1]){
            return nums[0];
        }
        int low=0;int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            if(mid%2==1&&nums[mid-1]==nums[mid]||mid%2==0&&nums[mid]==nums[mid+1]){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return-1;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(singleNonDuplicate(arr));
    }
}
