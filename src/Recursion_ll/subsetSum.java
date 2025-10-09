package Recursion_ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class subsetSum {
    public static List<Integer> subsetSum(int arr[],int N){
        List<Integer>sumSubset=new ArrayList<>();
        func(0,0,arr,N,sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
    public static void func(int ind, int sum, int arr[],int N,List<Integer>sumSubset){
        if (ind==N){
            sumSubset.add(sum);
            return;
        }
        func(ind+1,sum+arr[ind],arr,N,sumSubset);
        func (ind+1,sum,arr,N,sumSubset);

    }

    public static void main(String[] args) {
        int arr[]={2,3,1};
        int n=arr.length;
        System.out.println(subsetSum(arr,n));

    }

}
