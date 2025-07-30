package Binary_search_1D;

public class find_minimum_in_rotatedArray_with_duplicate {
    public static int findMin(int[] nums){
        int n=nums.length;
        int low=0;int high=n-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (nums[low]==nums[mid]&&nums[mid]==nums[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            if (nums[low]<=nums[mid]){
                min=Math.min(min,nums[low]);
                low=mid+1;
            }
            else {
                min=Math.min(min,nums[mid]);
                high=mid-1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int nums[]={2,5,5,6,1,2};
        System.out.println(findMin(nums));
    }
}
