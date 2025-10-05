package Array_Level_III;

import java.util.HashMap;

public class Largest_SubArraysWith_0_Sum {

    //Brute Approach,.................................................
//    public static int maxLen(int arr[]){
//        int n=arr.length;
//        int max=0;
//        for (int i=0;i<n;i++){
//            int sum=0;
//            for (int j=i;j<n;j++){
//              sum+=arr[j];
//              if (sum==0){
//                   max=Math.max(max,(j-i)+1);
//              }
//            }
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        int arr[]={1,-1,3,2,-2,-8,1,7,10,23};
//        System.out.println(maxLen(arr));
//    }

    //Optimal Approach............................................
    public static int maxLen(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer>temp=new HashMap<>();
        int maxi=0;
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if (sum==0){
                maxi=i+1;
            }

            if (temp.containsKey(sum)){
                maxi=Math.max(maxi,i- temp.get(sum));
            }
            else {
                temp.put(sum,i);
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[]={1,-1,3,2,-2,-8,1,7,10,23};
        System.out.println(maxLen(arr));
    }
}
