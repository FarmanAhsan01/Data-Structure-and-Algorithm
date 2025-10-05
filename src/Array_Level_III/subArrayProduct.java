package Array_Level_III;

public class subArrayProduct {
    //Brute Approach...............................

    //BETTER Approach.........................................
//    public static int subArrayProduct(int arr[]){
//        int n=arr.length;
//            int max=Integer.MIN_VALUE;
//        for (int i=0;i<n;i++){
//            int product=1;
//            for (int j=i;j<n;j++){
//                product=product*arr[j];
//                max=Math.max(max,product);
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        int arr[]={-2,0,-1};
//        System.out.println(subArrayProduct(arr));
//    }

    //Optimal Approach.............................................

    public static int subArrayProduct(int nums[]){
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int prefix=1;
        int suffix=1;
        for (int i=0;i<n;i++){
            prefix=prefix*nums[i];
            suffix=suffix*nums[n-i-1];
            if (prefix==0) prefix=1;
            if (suffix==0) suffix=1;
            System.out.println(prefix+" "+suffix);
            max=Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,-2,4};
        System.out.println(subArrayProduct(arr));
    }
}
