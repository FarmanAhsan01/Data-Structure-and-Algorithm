package Bit_Manipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findTwoNumbersAppearingOddNumberTimes {
//    public static List<Integer>twoTimesOddAppears(int nums[]) {
//        int n=nums.length;;
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for (int i=0;i<n;i++){
//            int num=nums[i];
//           map.put(num,map.getOrDefault(num,0)+1);
//        }
//        List<Integer>list=new ArrayList<>();
//        for (int key:map.keySet()){
//            if (map.get(key)%2!=0){
//                 list.add(key);
//            }
//        }
//        return list;
//    }
//    public static void main(String[] args) {
//        int nums[]={2,4,2,6,3,7,7,3};
//        List<Integer>ans=twoTimesOddAppears(nums);
//        System.out.println(ans);
//    }

    //Optimal Approach..............................................
    public static int[] twoTimesOddAppears(int nums[]) {
        int n = nums.length;
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ nums[i];
        }
        int rightMost = (int) (xorr & (xorr - 1)) ^ (int) xorr;
        int bucket1 = 0, bucket2 = 0;
        for (int i = 0; i < n; i++) {
            if ((nums[i] & rightMost) != 0) {
                bucket1 = bucket1 ^ nums[i];
            } else {
                bucket2 = bucket2 ^ nums[i];
            }
        }
        return new int[]{bucket1, bucket2};
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 2, 6, 3, 7, 7, 3};
        int[] ans = twoTimesOddAppears(nums);

        System.out.println("The single numbers in given array are: " + ans[0] + " and " + ans[1]);
    }
}