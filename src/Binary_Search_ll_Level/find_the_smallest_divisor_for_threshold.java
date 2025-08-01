package Binary_Search_ll_Level;

public class find_the_smallest_divisor_for_threshold {
    //brute Approach......................................................
//    public static int max(int nums[]){
//        int n=nums.length;
//        int max=Integer.MIN_VALUE;
//        for (int i=0;i<n;i++){
//            if (nums[i]>max){
//                max=nums[i];
//            }
//        }
//        return max;
//    }
//    public static int smallestDivisor(int [] nums,int threshold) {
//        int n=nums.length;
//        for (int i=1;i<=max(nums);i++){
//            int sum=0;
//            for (int j=0;j<n;j++){
//                sum+=Math.ceil(nums[j]/(double)i);
//            }
//            if (sum<=threshold){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int nums[]={1,2,5,9};
//        int threshold=6;
//        System.out.println(smallestDivisor(nums,threshold));
//    }
    public static int max(int nums[]){
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    public static int sumDiv(int nums[],int divisor){
        int sum=0;
        int n=nums.length;
        for (int i=0;i<n;i++){
            sum+=(int)Math.ceil((double)nums[i]/divisor);
        }
        return sum;
    }
    public static int smallestDivisor(int nums[],int threshold){
        int n=nums.length;
        int low=1;int high=max(nums);
        while(low<=high){
            int mid=(low+high)/2;
            if (sumDiv(nums,mid)<=threshold){
                high=mid-1;
            }
            else {
                low=mid+1;
            }

        }
        return low;
    }
    public static void main(String[] args) {
        int nums[]={1,2,5,9};
        int threshold=6;
        System.out.println(smallestDivisor(nums,threshold));
    }
}
