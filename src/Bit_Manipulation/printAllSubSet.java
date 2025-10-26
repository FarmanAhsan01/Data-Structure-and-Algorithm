package Bit_Manipulation;

import java.util.ArrayList;
import java.util.List;

public class printAllSubSet {
    public static List<List<Integer>> allSubset(int nums[]){
        int n=nums.length;
        int subsets=1<<n;
        List<List<Integer>>ans=new ArrayList<>();
        for (int i=0;i<subsets;i++){
            List<Integer>sub=new ArrayList<>();
            for (int j=0;j<n;j++){
                if ((i&(1<<j))!=0){
                    sub.add(nums[j]);
                }
            }
            ans.add(sub);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3};
        List<List<Integer>>result=allSubset(nums);
        System.out.println(result);
    }
}
