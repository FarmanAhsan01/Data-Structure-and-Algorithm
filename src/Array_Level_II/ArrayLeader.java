package Array_Level_II;

import java.util.ArrayList;

public class ArrayLeader {


        //Brute Approach...............................................
//        public static ArrayList<Integer> leader(int arr[]){
//        int n=arr.length;
//        ArrayList<Integer>temp=new ArrayList<>();
//        for (int i=0;i<n;i++){
//            String lead="true";
//            for (int j=i+1;j<n;j++){
//                if (arr[j]>arr[i]){
//                    lead="false";
//                    break;
//                }
//            }
//            if (lead=="true"){
//                temp.add(arr[i]);
//            }
//        }
//
//        return temp;
//    }
//        public static void main(String[] args) {
//            int arr[]={16, 17, 4, 3, 5, 2};
//            System.out.println(leader(arr));
//
//        }

        //Optimal Approach...............................................
    public static ArrayList<Integer>leader(int arr[]){
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
       for (int i=n-1;i>=0;i--){
           if (maxi<arr[i]){
               ans.add(arr[i]);
               maxi=arr[i];
           }
//           maxi=Math.max(maxi,arr[i]);
       }
        int l=ans.size();
       for (int i=0;i<l/2;i++){
           int temp=ans.get(i);
           ans.set(i, ans.get(l - i - 1));
           ans.set(l - i - 1, temp);
       }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={16, 17, 4, 3, 5, 2};
        System.out.println(leader(arr));
    }
}
