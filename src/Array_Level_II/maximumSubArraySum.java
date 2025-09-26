package Array_Level_II;

public class maximumSubArraySum {
    //Brute Approach....................................
//    public static int maxSub(int nums[]){
//        int n=nums.length;
//        int max=Integer.MIN_VALUE;
//        for (int i=0;i<n;i++){
//            for (int j=i;j<n;j++){
//                int sum=0;
//                for (int k=i;k<=j;k++){
//                    sum+=nums[k];
//                     max=Math.max(sum,max);
//                }
//            }
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(maxSub(nums));
//    }
    //Better Solution..................................
//    public static int maxsub(int nums[]){
//        int n=nums.length;
//        int max= Integer.MIN_VALUE;
//        for (int i=0;i<n;i++){
//            int sum=0;
//            for (int j=i;j<n;j++){
//                sum+=nums[j];
//                max=Math.max(max,sum);
//            }
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(maxsub(nums));
//    }

    //Optimal Approach................................
    public static int maxSub(int nums[]){
        int n=nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            sum+=nums[i];
            if (sum>max){
                max=sum;
            }
            if (sum<0){
                sum=0;
            }
//           if the sum of the empty subarray
//            if (max<0){
//                max=0;
//            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSub(nums));
    }
}
