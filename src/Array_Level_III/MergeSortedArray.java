package Array_Level_III;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class MergeSortedArray {
//    public static void merge(int[] nums1,int m,int [] nums2,int n){
//        int arr3[]=new int[m+n];
//        int left=0;
//        int right=0;
//        int index=0;
//        while(left<m&&right<n){
//            if (nums1[left]<=nums2[right]){
//               arr3[index]=nums1[left];
//               index++;
//               left++;
//            }
//            else {
//                arr3[index]=nums2[right];
//                index++;
//                right++;
//            }
//
//        }
//        while(left<m){
//                arr3[index++]=nums1[left++];
//        }
//        while (right<n){
//
//                arr3[index++]=nums2[right++];
//        }
//        for (int i=0;i<m+n;i++){
//            nums1[i]=arr3[i];
//        }
//
//        //for finding sorted nums1 and sorted nums2 ...................
////        for (int i=0;i<n+m;i++){
////            if (i<m){
////                nums1[i]=arr3[i];
////            }
////            else{
////                nums2[i-m]=arr3[i];
////            }
////        }
//    }
//
//    public static void main(String[] args) {
//        int nums1[]={1,2,3,0,0,0};
//        int nums2[]={2,5,6};
//        int m=3;
//        int n=3;
//       merge(nums1,m,nums2,n);
////       for (int i=0;i<m;i++){
////           System.out.print(nums1[i]);
////       }
////        System.out.println();
////       for (int j=0;j<n;j++){
////           System.out.print(nums2[j]);
////       }
//
//
//    }
    //Optimal 1 Approach............................................
//    public static void merge(int nums1[],int n,int nums2[],int m){
//        int left=n-1;
//        int right=0;
//        while(left>=0&&right<m){
//            if (nums1[left]>nums2[right]){
//                int temp=nums1[left];
//                nums1[left]=nums2[right];
//                nums2[right]=temp;
//                left--;
//                right++;
//            }
//            else {
//                break;
//            }
//        }
//      Arrays.sort(nums1);
//        Arrays.sort(nums2);
//    }
//    public static void main(String[] args) {
//        int nums1[]={1,3,5,7};
//        int nums2[]={0,2,6,8,9};
//        int l=nums1.length;
//        int m=nums2.length;
//        merge(nums1,l,nums2,m);
//        for (int i=0;i<l;i++){
//            System.out.print(nums1[i]);
//        }
//        System.out.println();
//        for (int j=0;j<m;j++){
//            System.out.print(nums2[j]);
//        }
//    }

    //Optimal 2 Approach........................................
    public static void swap(int nums1[],int nums2[],int idx1,int idx2){
        if (nums1[idx1]>nums2[idx2]){
            int temp=nums1[idx1];
            nums1[idx1]=nums2[idx2];
            nums2[idx2]=temp;
        }
    }
    public static void merge(int nums1[],int n,int nums2[],int m){
        int len=n+m;
        int gap=(len/2)+(len%2);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                if (left<n&&right>=n){
                    swap(nums1,nums2,left,right-n);
                }
                else if (left>=n){
                    swap(nums1,nums2,left-n,right-n);
                }
                else {
                   swap(nums1,nums2,left,right);
                }
                left++;
                right++;
            }
            if (gap==1){
                break;
            }
            gap=(gap/2)+(gap%2);

        }
    }
    public static void main(String[] args) {
        int nums1[]={1,3,5,7};
        int nums2[]={0,2,6,8,9};
        int n= nums1.length;
        int m=nums2.length;
        merge(nums1,n,nums2,m);
        for (int i=0;i<n;i++){
            System.out.print(nums1[i]);
        }
        System.out.println();
        for (int i=0;i<n;i++){
            System.out.print(nums2[i]);
        }
    }
}
