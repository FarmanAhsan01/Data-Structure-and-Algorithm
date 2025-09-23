package Array;

import java.util.HashSet;

public class Remove_Duplicate_Sorted_Array {
    //brute approach
//    public static int removeDuplicate(int[] nums){
//       int n=nums.length;
//        HashSet<Integer>l1=new HashSet<>();
//        for (int i=0;i<n;i++){
//            l1.add(nums[i]);
//        }
//        int k= l1.size();
//        int j=0;
//        for (int x:l1){
//           nums[j++]=x;
//        }
//        return k;
//    }

    //Optimal approach......................
    public static int removeDuplicate(int arr[]){
        int i=0;
        for (int j=1;j<arr.length;j++){
            if (arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }


    public static void main(String[] args) {
        int nums[]={1,1,2,2,3,3,4,4};
        int n=nums.length;
        int k=removeDuplicate(nums);
        for(int i=0;i<k;i++){
            System.out.println(nums[i]);
        }
    }
}
