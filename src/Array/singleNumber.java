package Array;

public class singleNumber {

        //brute approach.............................
 //       public static int single(int nums[]){
//        int n=nums.length;
//        for (int i=0;i<n;i++){
//            int num=nums[i];
//            int count=0;
//           for (int j=0;j<n;j++){
//               if (nums[j]==num){
//                   count++;
//               }
//           }
//            if (count==1){
//                return num;
//            }
//        }
//        return -1;
//
//    }
//    public static void main(String[] args) {
//        int nums[]={1,2,1,4,2};
//        System.out.println(single(nums));
//    }

        //better Approach..............................we also use hashmap
//    public static int single(int nums[]){
//        int n=nums.length;
//        // find max for finding size of hash
//        int maxi=nums[0];
//        for (int i=0;i<n;i++){
//            maxi=Math.max(maxi,nums[i]);
//        }
//        //making hash array
//        int hash[]=new int[maxi+1];
//        ///add in hashing
//        for (int i=0;i<n;i++){
//            hash[nums[i]]++;
//        }
//        for (int i=0;i<n;i++){
//            if (hash[nums[i]]==1){
//                return nums[i];
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int nums[]={1,2,1,4,2};
//        System.out.println(single(nums));
//    }

    //optimal Approach..................................
    public static int single(int nums[]){
        int n=nums.length;
        int xor=0;
        for (int i=0;i<n;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int nums[]={1,1,2,3,3,4,4};
        System.out.println(single(nums));
    }
}
