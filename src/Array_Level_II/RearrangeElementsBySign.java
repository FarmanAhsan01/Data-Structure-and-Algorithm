package Array_Level_II;

import java.util.ArrayList;

public class RearrangeElementsBySign {
    //Better Approach...................................................
//    public static int[] rearrangeArray(int []nums){
//        ArrayList<Integer>pos=new ArrayList<>();
//        ArrayList<Integer>neg=new ArrayList<>();
//        int n=nums.length;
//        for (int i=0;i<n;i++){
//            if (nums[i]>0){
//                pos.add(nums[i]);
//            }
//            else {
//                neg.add(nums[i]);
//            }
//        }
//        for (int i=0;i<n/2;i++){
//            nums[2*i]=pos.get(i);
//            nums[2*i+1]=neg.get(i);
//        }
//        return nums;
//    }
//    public static void main(String[] args) {
//        int nums[]={3,1,-2,-5,2,-4};
//        int n=nums.length;
//        rearrangeArray(nums);
//        for (int i=0;i<n;i++){
//            System.out.println(nums[i]);
//        }
//    }
//    Optimal Approach....................................................
//    public static int[] rearrangeArray(int nums[]){
//        int n=nums.length;
//        int ans[]=new int[n];
//        int posIndex=0,negIndex=1;
//        for (int i=0;i<n;i++){
//            if (nums[i]<0){
//                ans[negIndex]=nums[i];
//                negIndex+=2;
//            }
//            else {
//                ans[posIndex]=nums[i];
//                posIndex+=2;
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int nums[]={3,1,-2,-5,2,-4};
//        rearrangeArray(nums);
//        for (int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }
//    }

    //second version of question where neg is not equal to positive
    public static int[] rearrangeArray(int nums[]){
        int n=nums.length;
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for (int i=0;i<n;i++){
            if (nums[i]>0){
               pos.add(nums[i]);
            }
            else {
                neg.add(nums[i]);
            }
        }

        if (pos.size()>= neg.size()){
            for (int i=0;i<neg.size();i++){
                nums[2*i]=pos.get(i);
                nums[2*i+1]=neg.get(i);
            }
            int index=2*neg.size();
            for (int i=neg.size();i< pos.size();i++){
                nums[index]=pos.get(i);
                index++;
            }
        }
        else {
            for (int i=0;i<pos.size();i++){
                nums[2*i]=pos.get(i);
                nums[2*i+1]=neg.get(i);
            }
            int index=2*pos.size();
            for (int i=pos.size();i< neg.size();i++){
                nums[index]=neg.get(i);
                index++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[]={-1,2,3,4,-3,1};
        rearrangeArray(nums);
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
