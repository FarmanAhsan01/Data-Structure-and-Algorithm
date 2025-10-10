package Recursion_ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSetSumII {
    public static List<List<Integer>>func(int arr[]){
        Arrays.sort(arr);
        List<List<Integer>>ansList=new ArrayList<>();
        findSubsets(0,arr,new ArrayList<>(),ansList);
        return ansList;
    }
    public static void findSubsets (int ind,int arr[],List<Integer>ds,List<List<Integer>>ansList){
        ansList.add(new ArrayList<>(ds));
        for (int i=ind;i<arr.length;i++){
            if (i!=ind && arr[i]==arr[i-1]){
                continue;
            }
            ds.add(arr[i]);
            findSubsets(i+1,arr,ds,ansList);
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,4};
        System.out.println(func(arr));
    }
}
