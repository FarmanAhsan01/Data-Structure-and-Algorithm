package Binary_Search_ll_Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Split_Array_Largest_Sum {
    public static int splitLargestSum(ArrayList<Integer>nums, int split){
        int n=nums.size();
        int students=1;
        long pagesStudent=0;
        for (int i=0;i<n;i++){
            if(pagesStudent+nums.get(i)<=split){
                pagesStudent+=nums.get(i);
            }
            else {
                students++;
                pagesStudent=nums.get(i);
            }
        }
        return students;
    }
    public static int maxSplit(ArrayList<Integer>nums, int k,int n){
        if(k>n){
            return -1;
        }
        int low= Collections.max(nums);
        int high=nums.stream().mapToInt(Integer::intValue).sum();
        for (int i=low;i<high;i++){
            if(splitLargestSum(nums,i)==k){
                return i;
            }
        }
        return low;
    }
    public static void main(String[] args){
        ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(10,20,30,40));
        int n=nums.size();
        int k=2;
        System.out.println(maxSplit(nums,k,n));
    }
}
