package Binary_search_1D;

public class searchElement_RotatedArray {
//    public static int search(int nums[],int target){
//        int n=nums.length;
//        int low=0;int high=n-1;
//        int ans=-1;
//        while(low<=high){
//            int mid=low+(high-low)/2;
//            if (nums[mid]==target){
//               return mid;
//            }
//            if (nums[low]<=nums[mid]){
//                if (nums[low]<=target&&target<=nums[mid]){
//                    high=mid-1;
//                }
//                else {
//                    low=mid+1;
//                }
//            }
//            else {
//                if (nums[high]>=target&&target>=nums[mid]){
//                    low=mid+1;
//                }
//                else {
//                    high=mid-1;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int arr[]={4,5,6,7,0,1,2};
//        int target=0;
//        System.out.println(search(arr,target));
//    }

    public static int search(int nums[],int target){
        int n=nums.length;
        int low=0, high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==nums[mid]){
                return mid;
            }
            if (nums[low]<=nums[mid]){
                if(nums[low]<=target&&target<=nums[mid]){
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            else{
                if (nums[high]>=target&&target>=nums[mid]){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums,target));

    }
}
