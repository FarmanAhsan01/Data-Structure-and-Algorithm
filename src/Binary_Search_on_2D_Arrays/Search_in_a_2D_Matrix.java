package Binary_Search_on_2D_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Search_in_a_2D_Matrix {
    //Brute Force ...................................................
//    public static boolean search(ArrayList<ArrayList<Integer>>matrix ,int n,int m,int target){
//        for(int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//               if (matrix.get(i).get(j)==target){
//                   return true;
//               }
//            }
//        }
//        return false;
//    }

    //Better Approach..................................................
//    public static boolean binarySearch(ArrayList<Integer>nums,int target){
//        int n=nums.size();
//        int low=0,high=n-1;
//        while(low<=high){
//            int mid=(low+high)/2;
//            if(nums.get(mid)==target){
//                return true;
//            } else if (target>nums.get(mid)) {
//                low=mid+1;
//            }
//            else {
//                high=mid-1;
//            }
//        }
//        return false;
//    }
//    public static boolean search(ArrayList<ArrayList<Integer>>matrix ,int n,int m,int target){
//        for (int i=0;i<n;i++){
//            if (matrix.get(i).get(0)<=target && matrix.get(i).get(m-1)>=target){
//                    return binarySearch(matrix.get(i),target);
//            }
//        }
//        return false;
//    }

    //Optimal Approach..............................
    public static boolean search(ArrayList<ArrayList<Integer>>matrix ,int n,int m,int target){
        int low=0,high=(n*m-1);
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m,col=mid%m;
            if(matrix.get(row).get(col)==target){
                return true;
            }
            else if (matrix.get(row).get(col)<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return false;
    }


    public static void main(String[] args){
        ArrayList<ArrayList<Integer>>matrix=new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(3,4,7,9)));
        matrix.add(new ArrayList<>(Arrays.asList(12,13,16,18)));
        matrix.add(new ArrayList<>(Arrays.asList(20,21,23,29)));
        int n=3,m=4;
        int target=9;
        System.out.println(search(matrix,n,m,target));;
    }

}
