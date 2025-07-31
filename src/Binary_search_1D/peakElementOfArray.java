package Binary_search_1D;

public class peakElementOfArray {
    //using Brute approach.................................
    public static int findPeakElement(int nums[]){
        int n=nums.length;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;

        for (int i=1;i<n-1;i++){
            if(nums[i]>nums[i-1]&&nums[i]>nums[i+1]){
                return i;
            }
        }
        return -1;
    }
    //Optimal approach......................................
//    public static int findPeakElement(int nums[]){
//        int n=nums.length;
//        if (n==1) return 0;
//        if (nums[0]>nums[1]) return 0;
//        if (nums[n-1]>nums[n-2]) return n-1;
//        int low=1;int high=n-2;
//        while (low<=high){
//            int mid=(low+high)/2;
//            if (nums[mid]>nums[mid+1]&&nums[mid-1]<nums[mid]){
//                return mid;
//            }
//            else if (nums[mid]>nums[mid-1]){
//               low=mid+1;
//            }
////            for one peak..............................................
//
//            else if (nums[mid]<nums[mid-1]){
//                high=mid-1;
//            }
//            //for.many peaks..................................................
//            else {
//                high=mid-1;
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,9,6,4,3};
        System.out.println(findPeakElement(nums));
    }
}
