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
//    public static double medianOfTwoSortedArray(int nums1[],int nums2[]){
//        int n1=nums1.length;
//        int n2=nums2.length;
//
//        int i=0;
//        int j=0;
//        int n=(n1+n2);
//        int ind2=n/2;
//        int ind1=ind2-1;
//        int cnt=0;
//        int ind1el=-1;
//        int ind2el=-1;
//        while(i<n1&&j<n2){
//            if(nums1[i]<nums2[j]){
//                if(cnt==ind1){
//                    ind1el=nums1[i];
//                }
//                if(cnt==ind2){
//                    ind2el=nums1[i];
//                }
//                cnt++;
//                i++;
//            }
//            else{
//                if(cnt==ind1){
//                    ind1el=nums2[j];
//                }
//                if(cnt==ind2){
//                    ind2el=nums2[j];
//                }
//                cnt++;
//                j++;
//            }
//        }
//        while (i < n1) {
//            if (cnt == ind1) ind1el = nums1[i];
//            if (cnt == ind2) ind2el = nums1[i];
//            cnt++;
//            i++;
//        }
//        while (j < n2) {
//            if (cnt == ind1) ind1el = nums2[j];
//            if (cnt == ind2) ind2el = nums2[j];
//            cnt++;
//            j++;
//        }
//        if (n % 2 == 1) {
//            return (double)ind2el;
//        }
//
//        return (double)((double)(ind1el + ind2el)) / 2.0;
//
//
//    }

    //Optimal Approach.....................................................
    public static double median(int[] a, int[] b) {
        int n1 = a.length, n2 = b.length;
        if (n1 > n2) return median(b, a);

        int n = n1 + n2;
        int left = (n1 + n2 + 1) / 2;
        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int nums1[]={1,3,4,7,10,12};
        int nums2[]={2,3,6,15};

        System.out.println("The median of two sorted arrays is " + median(nums1, nums2));
    }
}
