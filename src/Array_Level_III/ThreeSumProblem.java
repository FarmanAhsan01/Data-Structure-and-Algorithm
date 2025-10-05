package Array_Level_III;

import java.util.*;

public class ThreeSumProblem {
    //Brute Approach..................................................
//    public static List<List<Integer>> sum(int nums[]){
//        HashSet<List<Integer>>st=new HashSet<>();
//        int n=nums.length;
//        for (int i=0;i<n;i++){
//            for (int j=i+1;j<n;j++){
//                for (int k=j+1;k<n;k++){
//                    if (nums[i]+nums[j]+nums[k]==0){
//                        List<Integer>temp= Arrays.asList(nums[i],nums[j],nums[k]);
//                        Collections.sort(temp);
//                        st.add(temp);
//                    }
//                }
//            }
//        }
//        List<List<Integer>>ans=new ArrayList<>(st);
//        return ans;
//    }
//    public static void main(String[] args) {
//        int nums[]={-1,0,1,2,-1,-4};
//        int n = nums.length;
//        List<List<Integer>> ans = sum(nums);
//        for (List<Integer> it : ans) {
//            System.out.print("[");
//            for (Integer i : it) {
//                System.out.print(i + " ");
//            }
//            System.out.print("] ");
//        }
//        System.out.println();
//
//    }
    //Better Approach........................................
//    public static List<List<Integer>>sum(int nums[]){
//        int n=nums.length;
//        HashSet<List<Integer>>st=new HashSet<>();
//        for (int i=0;i<n;i++){
//            HashSet<Integer>sl=new HashSet<>();
//            for (int j=i+1;j<n;j++){
//                int third=-(nums[i]+nums[j]);
//                if (sl.contains(third)){
//                    List<Integer>temp=Arrays.asList(nums[i],nums[j],third);
//                    Collections.sort(temp);
//                    st.add(temp);
//                }
//                sl.add(nums[j]);
//            }
//        }
//        List<List<Integer>>ans=new ArrayList<>(st);
//        return ans;
//    }
//    public static void main(String[] args) {
//        int nums[]={-1,0,1,2,-1,-4};
//        int n = nums.length;
//        List<List<Integer>> ans = sum(nums);
//        for (List<Integer> it : ans) {
//            System.out.print("[");
//            for (Integer i : it) {
//                System.out.print(i + " ");
//            }
//            System.out.print("] ");
//        }
//        System.out.println();
//    }

    //Optimal Approach.......................................................

    public static List<List<Integer>>sum(int nums[]){
        int n= nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<n;i++){
            if (i>0&& nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while (j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if (sum<0){
                    j++;
                }
                else if (sum>0){
                    k--;
                }
                else {
                    List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k&&nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k&&nums[k]==nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = sum( arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

}
