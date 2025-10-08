package Recursion_ll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class printingSubsequenceWhoseSumisK {

    //for printing all subsequence whose sum is equal to k............................................

//    public static void printS(int ind, List<Integer>ds,int s, int sum, int arr[], int n){
//        if (ind==n){
//            if (s==sum){
//                for (int it:ds){
//                    System.out.print(it+" ");
//                }
//                System.out.println();
//            }
//            return ;
//        }
//        ds.add(arr[ind]);
//        s+=arr[ind];
//        printS(ind+1,ds,s,sum,arr,n);
//        s-=arr[ind];
//        ds.remove(ds.size()-1);
//         printS(ind+1,ds,s,sum,arr,n);
//    }

    //for printing any one subsequence whose sum is equal to k..............................................

//    public static boolean printS(int ind, List<Integer>ds,int s, int sum, int arr[], int n){
//        if (ind==n){
//            if (s==sum){
//                for (int it:ds){
//                    System.out.print(it+" ");
//                }
//                System.out.println();
//                return true;
//            }
//            return false;
//        }
//        ds.add(arr[ind]);
//        s+=arr[ind];
//        if (printS(ind+1,ds,s,sum,arr,n)==true){
//            return true;
//        }
//        s-=arr[ind];
//        ds.remove(ds.size()-1);
//        if (printS(ind+1,ds,s,sum,arr,n)==true){
//            return true;
//        }
//        return false;
//    }

//    public static int printS(int ind,int s, int sum, int arr[], int n){
//        if (ind==n){
//            if (s==sum){
//                return 1;
//            }
//            return 0;
//        }
//        s+=arr[ind];
//        int l=printS(ind+1,s,sum,arr,n);
//        s-=arr[ind];
//        int r=printS(ind+1,s,sum,arr,n);
//        return l+r;
//    }

    public static List<List<Integer>>combinationSum2(int candidates[],int target){
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public static void findCombinations(int ind,int arr[],int target,List<List<Integer>>ans,List<Integer>ds){
        if (target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if (i>ind && arr[i]==arr[i-1]){
                continue;
            }
            if (arr[i]>target){
                break;
            }
            ds.add(arr[i]);
            findCombinations(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=3;
        int sum=2;
        List<List<Integer>> ans = combinationSum2(arr, sum);
        System.out.println(ans);

    }
}
