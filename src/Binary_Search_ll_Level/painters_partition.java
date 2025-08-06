package Binary_Search_ll_Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class painters_partition {
    public static int partition(ArrayList<Integer>nums,int dist){
        int n=nums.size();
        int students=1;
        long pagesStudent=0;
        for (int i=0;i<n;i++){
            if(pagesStudent+nums.get(i)<=dist){
                pagesStudent+=nums.get(i);
            }
            else {
                students++;
                pagesStudent=nums.get(i);
            }
        }
        return students;
    }
    //Brute Approach......................................
//    public static int maxPart(ArrayList<Integer>nums,int part,int n){
//        if(part>n){
//            return -1;
//        }
//        int low= Collections.max(nums);
//        int high=nums.stream().mapToInt(Integer::intValue).sum();
//        for (int i=low;i<high;i++){
//            if(partition(nums,i)==part){
//                return i;
//            }
//        }
//        return low;
//    }

    //Optimal Approach...........................................
    public  static  int maxPart(ArrayList<Integer>nums,int part,int n){
        if(part>n){
            return -1;
        }
        int low= Collections.max(nums);
        int high=nums.stream().mapToInt(Integer::intValue).sum();

        while (low<=high){
            int mid=(low+high)/2;
            int noStudent=partition(nums,mid);
            if(noStudent>part){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(10,20,30,40));
        int n=nums.size();
        int k=2;
        System.out.println(maxPart(nums,k,n));
    }
}
