package Array_Level_II;

import java.util.HashMap;
import java.util.Map;

public class majority_element_nhalf2greater {
//    public static int majority(int arr[]){
//        int n=arr.length;
//        int count =0;
//        for (int i=0;i<n;i++){
//            for (int j=i;j<n;j++){
//                if (arr[j]==arr[i]){
//                    count++;
//                }
//            }
//            if (count>n/2){
//                return arr[i];
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int arr[]={2,2,3,3,1,2,2};
//        System.out.println(majority(arr));
//    }
//    public static int majority(int nums[]){
//        int n=nums.length;
//        HashMap<Integer,Integer>map=new HashMap<>();
//
//        for (int i=0;i<n;i++){
//          int value= map.getOrDefault(nums[i],0) ;
//          map.put(nums[i],value+1);
//        }
//        for (Map.Entry<Integer,Integer>it:map.entrySet()){
//            if (it.getValue()>n/2){
//                return it.getKey();
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int nums[]={2,2,3,3,1,2,2};
//        System.out.println(majority(nums));
//    }
    //Optimal Approach........................................................
    public static int majority(int nums[]){
        int n= nums.length;
        int count =0;
        int ele =0;
        for (int i=0;i<n;i++){
            if (count==0){
                count=1;
                ele=nums[i];
            }
            else if (nums[i]==ele){
                count++;
            }
            else {
                count--;
            }
        }
        int count1=0;
        for (int i=0;i<n;i++){
            if (nums[i]==ele){
                count1++;
            }
        }
        if (count1>(n/2)){
            return ele;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(majority(nums));
    }
}
