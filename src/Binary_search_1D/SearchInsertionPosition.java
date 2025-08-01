package Binary_search_1D;

public class SearchInsertionPosition {
    public static int searchInsert(int[] nums, int target) {
        int n =nums.length;
        int ans = n;
        int high = n-1;
        int low =0;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] >=target){
                ans = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int target=4;
        System.out.println(searchInsert(arr,target));
    }

}
