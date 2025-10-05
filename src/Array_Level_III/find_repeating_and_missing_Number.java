package Array_Level_III;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class find_repeating_and_missing_Number {

    //Brute Approach.....................................................
//    public static ArrayList<Integer> findTwoElement(int arr[]){
//        int n=arr.length;
//        int repeating=-1;
//        int missing=-1;
//        for (int i=1;i<=n;i++){
//            int count=0;
//            for (int j=0;j<n;j++){
//                if (arr[j]==i){
//                    count++;
//                }
//            }
//            if (count==2){
//                repeating=i;
//            }
//            else if (count==0){
//                missing=i;
//            }
//            if (repeating!=-1&&missing!=-1){
//                break;
//            }
//        }
//      ArrayList<Integer>ans=new ArrayList<>();
//        ans.add(repeating);
//        ans.add(missing);
//        return ans;
//    }
//    public static void main(String[] args) {
//        int[] a = {2,2};
//       ArrayList<Integer>ans = findTwoElement(a);
//        System.out.println("The repeating and missing numbers are: {"
//                + ans.get(0) + ", " + ans.get(1)+ "}");
//    }

    //Better Approach.............................................................
//    public static ArrayList<Integer>findTwoElement(int arr[]){
//        int n=arr.length;
//        int []hash=new int[n+1];
//        for (int i=0;i<n;i++){
//            hash[arr[i]]++;
//        }
//        int repeating=-1;int missing=-1;
//        for (int i=1;i<=n;i++){
//            if (hash[i]==2){
//                repeating=i;
//            }
//            else if (hash[i]==0) missing=i;
//            if (repeating != -1 && missing != -1)
//                break;
//        }
//        ArrayList<Integer>ans=new ArrayList<>();
//        ans.add(repeating);
//        ans.add(missing);
//        return ans;
//    }
//    public static void main(String[] args) {
//        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
//       ArrayList<Integer>ans = findTwoElement(a);
//        System.out.println("The repeating and missing numbers are: {"
//                + ans.get(0) + ", " + ans.get(1) + "}");
//    }
//    }
//Optimal Approach...............................................

    public static ArrayList<Integer>findTwoElement(int arr[]){
        long n=arr.length;
        long sn=(n*(n+1))/2;
        long sn2=(n*(n+1)*(2*n+1))/6 ;
        long s=0;long s2=0;
        for (int i=0;i<n;i++){
            s+=arr[i];
            s2+=(long)arr[i]*(long)arr[i];
        }
        long val1=s-sn;
        long val2=s2-sn2;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add((int)x);
        ans.add((int) y);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={3, 1, 2, 5, 4, 6, 7, 5};
        ArrayList<Integer>ans = findTwoElement(arr);
        System.out.println("The repeating and missing numbers are: {"
                + ans.get(0) + ", " + ans.get(1) + "}");
    }

    //2nd Optimal Solution
//    public static int[] findMissingRepeatingNumbers(int[] a) {
//        int n = a.length; // size of the array
//        int xr = 0;
//
//        //Step 1: Find XOR of all elements:
//        for (int i = 0; i < n; i++) {
//            xr = xr ^ a[i];
//            xr = xr ^ (i + 1);
//        }
//
//        //Step 2: Find the differentiating bit number:
//        int number = (xr & ~(xr - 1));
//
//        //Step 3: Group the numbers:
//        int zero = 0;
//        int one = 0;
//        for (int i = 0; i < n; i++) {
//            //part of 1 group:
//            if ((a[i] & number) != 0) {
//                one = one ^ a[i];
//            }
//            //part of 0 group:
//            else {
//                zero = zero ^ a[i];
//            }
//        }
//
//        for (int i = 1; i <= n; i++) {
//            //part of 1 group:
//            if ((i & number) != 0) {
//                one = one ^ i;
//            }
//            //part of 0 group:
//            else {
//                zero = zero ^ i;
//            }
//        }
//
//        // Last step: Identify the numbers:
//        int cnt = 0;
//        for (int i = 0; i < n; i++) {
//            if (a[i] == zero) cnt++;
//        }
//
//        if (cnt == 2) return new int[] {zero, one};
//        return new int[] {one, zero};
//    }
//
//
//    public static void main(String[] args) {
//        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
//        int[] ans = findMissingRepeatingNumbers(a);
//        System.out.println("The repeating and missing numbers are: {"
//                + ans[0] + ", " + ans[1] + "}");
//    }
}

