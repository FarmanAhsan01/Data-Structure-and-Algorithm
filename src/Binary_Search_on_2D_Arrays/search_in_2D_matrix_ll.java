package Binary_Search_on_2D_Arrays;

import Binary_search_1D.Binary_Search_to_find_X_n_sorted_array;

public class search_in_2D_matrix_ll {
    //Brute Approach...............................

//    public static boolean search(int matrix[][] ,int target){
//        int n=matrix.length;
//        int m=matrix[0].length;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                if (matrix[i][j]==target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    //Better Approach..............................................

//    public static boolean binarySearch(int matrix[],int target){
//        int n=matrix.length;
//        int low=0,high=n-1;
//        while(low<=high){
//            int mid=(low+high)/2;
//            if(matrix[mid]==target){
//                return true;
//            }
//            else if(matrix[mid]<target){
//                low=mid+1;
//            }
//            else {
//                high=mid-1;
//            }
//        }
//        return false;
//    }
//
//    public static boolean search(int matrix[][],int target){
//        int n=matrix.length;
//        int m=matrix[0].length;
//
//        for (int i=0;i<n;i++){
//           boolean flag= binarySearch(matrix[i],target);
//           if (flag==true){
//               return true;
//           }
//        }
//        return false;
//    }

    //Optimal Approach...........................
    public static boolean search(int matrix[][],int target){
        int n=matrix.length;
        int m=matrix[0].length;
        int row=0,col=m-1;
        while(row<n && col>=0){
            if (matrix[row][col]==target){
                return true;
            }
            else if (matrix[row][col]<target) {
                row++;
            }
            else {
                col--;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int matrix[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=14;
        System.out.println(search(matrix,target));
    }
}
