package Array_Level_III;

import java.util.*;

public class FourSumProblem {

    //Brute Approach........................................................
//    public static List<List<Integer>>fourSum(int[]nums,int target){
//        int n=nums.length;
//        HashSet<List<Integer>>st=new HashSet<>();
//        for (int i=0;i<n;i++){
//            for (int j=i+1;j<n;j++){
//                for (int k=j+1;k<n;k++){
//                    for (int l=k+1;l<n;l++){
//                        if (nums[i]+nums[j]+nums[k]+nums[l]==target){
//                            List<Integer>temp= Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
//                            Collections.sort(temp);
//                            st.add(temp);
//                        }
//
//                    }
//                }
//            }
//        }
//        List<List<Integer>>ans=new ArrayList<>(st);
//        return ans;
//    }
//    public static void main(String[] args) {
//        int nums[]={1,0,-1,0,2,-2};
//        int target=0;
//        int n=nums.length;
//        List<List<Integer>> ans =fourSum(nums,target);
//        for (List<Integer>it:ans){
//            System.out.print("[");
//            for (Integer i : it) {
//                System.out.print(i + " ");
//            }
//            System.out.print("] ");
//        }
//           System.out.println();
//    }

    //Better Approach................................................................

//    public static List<List<Integer>>foursum(int nums[],int target){
//        int n = nums.length;
//        HashSet<List<Integer>> set = new HashSet<>();
//
//        Arrays.sort(nums); // Sorting helps in handling duplicates
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                HashSet<Long> st = new HashSet<>();
//                for (int k = j + 1; k < n; k++) {
//                    long four = (long) target - ((long) nums[i] + nums[j] + nums[k]); // Prevent overflow
//
//                    if (st.contains(four)) {
//                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) four);
//                        set.add(temp);
//                    }
//                    st.add((long) nums[k]); // Store as long to avoid issues
//                }
//            }
//        }
//
//        return new ArrayList<>(set);
//    }
//    public static void main(String[] args) {
//       int nums[]={1,2,-1,-2,2,0,-1};
//       int target=0;
//       List<List<Integer>>ans=foursum(nums,target);
//        for (List<Integer>it:ans){
//            System.out.print("[");
//            for (Integer i : it) {
//                System.out.print(i + " ");
//            }
//            System.out.print("] ");
//        }
//           System.out.println();
//    }
    public static List<List<Integer>>fourSum(int nums[],int target){
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<n;i++){
            if (i>0&&nums[i]==nums[i-1]) continue;
            for (int j=i+1;j<n;j++){
                if (j!=i+1&&nums[j]==nums[j-1]) continue;
               int k=j+1;
               int l=n-1;
               while(k<l){
                   long sum=(long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[l];
                   if (sum==target){
                       List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                       ans.add(temp);
                       k++;
                       l--;
                       while(k<l&&nums[k]==nums[k-1]){
                           k++;
                       }
                       while(k<l&&nums[l]==nums[l+1]){
                           l--;
                       }
                   } else if (sum<target) {
                       k++;
                   }else l--;
               }
            }
        }
       return ans;
    }

    public static void main(String[] args) {
        int nums[]={1,2,-1,-2,2,0,-1};
        int target=0;
        List<List<Integer>>ans=fourSum(nums,target);
        for (List<Integer>it:ans){
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
           System.out.println();
    }
}
