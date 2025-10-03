package Recursion_ll;

import java.util.ArrayList;
import java.util.List;

public class allSubsequence {
    public static List<List<Integer>> subsets(int [] nums){
        List<List<Integer>>result=new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }
    public static void backtrack(List<List<Integer>>result, List<Integer>current, int [] nums, int index){
        result.add(new ArrayList<>(current));
        for (int i=index;i<nums.length;i++){
            current.add(nums[i]);
            backtrack(result,current,nums,i+1);
            current.remove(current.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subsets(nums);
        System.out.println(result);
    }
}
