package Array;

public class Missing_Number {
    //brute approach.......................................
//    public static int missingNumber(int nums[]){
//        int n=nums.length;
//        int i;
//        for ( i=0;i<n;i++){
//            int flag=0;
//           for(int j=0;j<n;j++){
//               if (nums[j]==i){
//                   flag=1;
//                   break;
//               }
//           }
//           if (flag==0){
//               return i;
//           }
//        }
//        return i;
//    }
//    public static void main(String[] args) {
//        int nums[]={5,4,3,0,1,2,8,7};
//        System.out.println(missingNumber(nums));
//    }

    //BETTER APPROACH..................................
//    public static int missingNumber(int arr[]){
//         int n=arr.length;
//         int hash[]=new int[n];
//         int j;
//         for (int i=0;i<n-1;i++){
//             hash[arr[i]]=1;
//         }
//         for (j=0;j<n;j++){
//             if(hash[j]==0){
//                 return j;
//             }
//         }
//         return j;
//    }
//    public static void main(String[] args) {
//        int arr[]={0,2,3,4,5};
//        System.out.println( missingNumber(arr));
//    }

    //Optimal Approach.......................................
//    public static int missingNumber(int nums[]){
//        int n= nums.length;
//        int s2=0;
//        int sum=n*(n+1)/2;
//        for (int i=0;i<n;i++){
//            s2+=nums[i];
//        }
//        return sum-s2;
//    }
//    public static void main(String[] args) {
//        int nums[]={0,1,5,4,3};
//        System.out.println(missingNumber(nums));
//    }

    //second Optimal Approach.............................................
    public static int missingNumber(int nums[]){
        int n=nums.length;
        int xor1=0;
        int xor2=0;
        for (int i=0;i<n-1;i++){
            xor2=xor2^nums[i];
            xor1=xor1^i+1;
            xor1=xor1^n;
        }
        return xor1^xor2;
    }

    public static void main(String[] args) {
        int nums[]={0,1,5,4,3};
        System.out.println(missingNumber(nums));

    }
}

