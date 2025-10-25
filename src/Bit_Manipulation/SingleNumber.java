package Bit_Manipulation;

import java.util.HashMap;

public class SingleNumber {
    //Brute Approach.............................
//    public static int singleBit(int[] nums){
//        HashMap<Integer,Integer>map=new HashMap<>();
//        for (int i=0;i<nums.length;i++){
//            int num=nums[i];
//           map.put(num,map.getOrDefault(num,0)+1);
//        }
//        for (int key: map.keySet()){
//            if (map.get(key)==1){
//                return key;
//            }
//        }
//        return -1;
//    }

    //Optimal approach.................................
    public static int singleBit(int[] nums){
        int xor=0;
        for (int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int nums[]={4,4,3,1,2,1,2};
        System.out.println(singleBit(nums));
    }
}
