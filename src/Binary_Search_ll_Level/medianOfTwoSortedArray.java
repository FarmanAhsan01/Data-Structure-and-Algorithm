package Binary_Search_ll_Level;

import java.util.ArrayList;
import java.util.List;

public class medianOfTwoSortedArray {

    //Brute Approach...................................................

//    public static double medianOfTwoSortedArray(int nums1[],int nums2[]){
//        int n1=nums1.length;
//        int n2=nums2.length;
//        int n=n1+n2;
//        ArrayList<Integer>nums3=new ArrayList<>();
//        int i=0;
//        int j=0;
//        while (i<n1 && j<n2){
//            if (nums1[i]<nums2[j]){
//                nums3.add(nums1[i]);
//                i++;
//            }
//            else{
//                nums3.add(nums2[j]);
//                j++;
//            }
//        }
//        while(i<n1){
//            nums3.add(nums1[i]);
//            i++;
//        }
//        while(j<n2){
//            nums3.add(nums2[j]);
//            j++;
//        }
//        if(n%2==1){
//           return (double) nums3.get(n/2);
//        }
//        else {
//           return (double) (nums3.get(n/2)+nums3.get(n/2-1))/2;
//        }
//    }


    //Better Approach......................................................
    public static double medianOfTwoSortedArray(int nums1[],int nums2[]){
        int n1=nums1.length;
        int n2=nums2.length;

        int i=0;
        int j=0;
        int n=(n1+n2);
        int ind2=n/2;
        int ind1=ind2-1;
        int cnt=0;
        int ind1el=-1;
        int ind2el=-1;
        while(i<n1&&j<n2){
            if(nums1[i]<nums2[j]){
                if(cnt==ind1){
                    ind1el=nums1[i];
                }
                if(cnt==ind2){
                    ind2el=nums2[i];
                }
                cnt++;
                i++;
            }
            else{
                if(cnt==ind1){
                    ind1el=nums1[j];
                }
                if(cnt==ind2){
                    ind2el=nums2[j];
                }
                cnt++;
                j++;
            }
        }
        while (i < n1) {
            if (cnt == ind1) ind1el = nums1[i];
            if (cnt == ind2) ind2el = nums1[i];
            cnt++;
            i++;
        }
        while (j < n2) {
            if (cnt == ind1) ind1el = nums2[j];
            if (cnt == ind2) ind2el = nums2[j];
            cnt++;
            j++;
        }
        if (n % 2 == 1) {
            return (double)ind2el;
        }

        return (double)((double)(ind1el + ind2el)) / 2.0;


    }
    public static void main(String[] args) {
        int nums1[]={1,3,4,7,10,12};
        int nums2[]={2,3,6,15};

        System.out.println("The median of two sorted arrays is " + medianOfTwoSortedArray(nums1, nums2));
    }
}
