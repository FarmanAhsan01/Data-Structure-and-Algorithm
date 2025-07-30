package Binary_search_1D;

public class find_minimum_in_rotatedArray {
    public static int findMin(int[] nums){
      int n=nums.length;
      int low=0;int high=n-1;
      int min=Integer.MAX_VALUE;
      while(low<=high){
          int mid=low+(high-low)/2;
          //for slightly Optimization
          if (nums[low]<nums[high]){
              min=Math.min(min,nums[low]);
              break;
          }
          if(nums[low]<=nums[mid]){
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
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }
}
