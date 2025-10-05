package Array_Level_III;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_Element_nby3 {
    //Brute Approach...............................................
//    public static List<Integer>majority(int[] arr){
//        int n=arr.length;
//        List<Integer>ls=new ArrayList<>();
//
//        for (int i=0;i<n;i++){
//            if (ls.size()==0||ls.get(0)!=arr[i]){
//                int count =0;
//                for (int j=0;j<n;j++){
//                    if (arr[j]==arr[i]){
//                        count++;
//                    }
//                }
//                if (count>n/3){
//                    ls.add(arr[i]);
//                }
//            }
//            if (ls.size()==2){
//                break;
//            }
//        }
//        return ls;
//    }
//    public static void main(String[] args) {
//        int arr[]={1,1,1,2,2,3,3,3};
//        System.out.println(majority(arr));
//    }
    //Better Approach...............................................
//    public static List<Integer> majority(int[] arr){
//        int n=arr.length;
//        List<Integer>ls=new ArrayList<>();
//        HashMap<Integer,Integer> temp=new HashMap();
//        int mini=(int)(n/3)+1;
//        for (int i=0;i<n;i++){
//           int value=temp.getOrDefault(arr[i],0);
//           temp.put(arr[i],value+1);
//           if (temp.get(arr[i])==mini){
//               ls.add(arr[i]);
//           }
//        }
//        return ls;
//    }
//    public static void main(String[] args) {
//        int arr[]={2,3,3};
//        System.out.println(majority(arr));
//    }
    public static List<Integer>majority(int nums[]){
        int count1=0;
        int count2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        int n=nums.length;
        for (int i=0;i<n;i++){
            if (count1==0&&nums[i]!=el2){
                count1=1;
                el1=nums[i];
            } else if (count2==0&&nums[i]!=el1) {
                count2=1;
                el2=nums[i];
            }
            else if (el1==nums[i]){
                count1++;
            } else if (el2==nums[i]) {
               count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> ls = new ArrayList<>();
        count1=0;count2=0;
        for (int i=0;i<n;i++){
            if (nums[i]==el1) count1++;
            if (nums[i]==el2) count2++;
        }
        int mini = (int)(n / 3) + 1;
        if (count1 >= mini) ls.add(el1);
        if (count2 >= mini) ls.add(el2);

        return ls;
    }
    public static void main(String[] args) {
        int nums[]={1,1,1,2,2,3,3,3};
        System.out.println(majority(nums));
    }
}
