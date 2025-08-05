package Binary_Search_ll_Level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Book_Allocation {


    public static int countStudent(ArrayList<Integer>nums,int pages){
        int n=nums.size();
        int students=1;
        long pagesStudent=0;
        for (int i=0;i<n;i++){
            if(pagesStudent+nums.get(i)<=pages){
                pagesStudent+=nums.get(i);
            }
            else {
                students++;
                pagesStudent=nums.get(i);
            }
        }
        return students;
    }

    //Brute Approach..........................................................
//    public static int bookAllocation(ArrayList<Integer> nums, int n,int students){
//        if(students>n){
//            return -1;
//        }
//        int low= Collections.max(nums);
//        int high=nums.stream().mapToInt(Integer::intValue).sum();
//        for (int pages=low;pages<high;pages++){
//            if(countStudent(nums,pages)==students){
//                return pages;
//            }
//        }
//        return low;
//    }

    //Optimal Approach...............................................................
    public static int bookAllocation(ArrayList<Integer> nums,int n,int students){
        if(students>n){
            return -1;
        }
        int low= Collections.max(nums);
        int high=nums.stream().mapToInt(Integer::intValue).sum();

        while (low<=high){
            int mid=(low+high)/2;
            int noStudent=countStudent(nums,mid);
            if(noStudent>students){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return low;
    }

    public static void main(String[] args){
       ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(25,46,28,49,24));
       int n=nums.size();
        int students=4;
        System.out.println(bookAllocation(nums,n,students));
    }
}
