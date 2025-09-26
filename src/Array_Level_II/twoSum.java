package Array_Level_II;

import java.util.HashMap;

public class twoSum {

    //BRUTE APPROACH........................................
//    public static int[] sum(int nums[],int target){
//        int n= nums.length;
//        int sum=0;
//        for (int i=0;i<n-1;i++){
//            for (int j=i+1;j<n;j++){
//                sum=nums[i]+nums[j];
//                if (sum==target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{};
//    }
//    public static void main(String[] args) {
//        int nums[]={2,7,11,15};
//        int target=9;
//        int[] result = sum(nums, target);
//        for (int x:result){
//            System.out.println(x);
//        }
//    }

    //BETTER APPROACH..........................................
//    public static int[] sum(int arr[],int target){
//        HashMap<Integer,Integer>l1=new HashMap<>();
//        int n=arr.length;
//
//        for (int i=0;i<n;i++){
//
//            int more=target-arr[i];
//            if (l1.containsKey(more)){
//                return new int[]{l1.get(more),i};
//            }
//            l1.put(arr[i],i);
//
//        }
//        return new int[]{};
//    }
//    public static void main(String[] args) {
//        int arr[]={2,6,5,8,11};
//        int target=14;
//        int result[]=sum(arr,target);
//        for (int x:result){
//            System.out.println(x);
//        }
//    }
    public static void sort(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static String sum(int arr[],int target){
        int n=arr.length;
        int left=0,right=n-1;
        sort(arr);
        while(left<right){
            int sum=arr[left]+arr[right];
            if (sum==target){
               return"yes";
            }
            else if(sum<target){
                left++;
            }
            else {
                right--;
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int target=14;
        System.out.println(sum(arr,target));
    }
}
