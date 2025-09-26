package Array_Level_II;

import java.util.Arrays;

public class sort_an_array_0_1_2 {
    //bryte approach....................................
    //using sorting
    //better approach..................................
//    public static void sort(int arr[]){
//        int n=arr.length;
//        int autoO=0,auto1=0,auto2=0;
//        for (int i=0;i<n;i++){
//            if (arr[i]==0){
//                autoO++;
//            } else if (arr[i]==1) {
//                auto1++;
//            }
//            else {
//                auto2++;
//            }
//        }
//        for (int i=0;i<autoO;i++){
//            arr[i]=0;
//        }
//        for (int j=autoO;j<autoO+auto1;j++) {
//            arr[j]=1;
//        }
//        for (int k=autoO+auto1;k<n;k++){
//            arr[k]=2;
//        }
//    }
//    public static void main(String[] args) {
//        int arr[]={0,1,2,0,1,2,1,2,0,0,0,1};
//        int n=arr.length;
//        sort(arr);
//        for (int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }
//    }

    //Optimal Approach................................................
    public static void sort(int nums[]){
        int n= nums.length;
        int low=0,mid=0,high=n-1;
       while(mid<=high){
            if (nums[mid]==0){
              int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
              low++;
              mid++;
            } else if (nums[mid]==1) {
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }

       }
    }
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        int n=arr.length;
        sort(arr);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

}
