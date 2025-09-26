package Array_Level_II;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spiral_Matrix {
    public static List<Integer>spiralOrder(int[][] matrix){
//        int n=matrix.length;
//        int m=matrix[0].length;
//        int top=0,bottom=m-1,left=0,right=n-1;
//        ArrayList<Integer>ans=new ArrayList<>();
//        while(top<=bottom&&left<=right){
//            for (int i=left;i<right;i++){
//                ans.add(matrix[top][i]);
//            }
//            top++;
//            for (int i=top;i<bottom;i++){
//                ans.add(matrix[i][right]);
//            }
//            right--;
//            if (top <= bottom) {
//                for (int i=right;i>left;i++){
//                    ans.add(matrix[bottom][i]);
//                }
//                bottom--;
//            }
//            for (int i=bottom;i>top;i++){
//                ans.add(matrix[i][left]);
//            }
//            left++;
//        }
//        return ans;
        int n = matrix.length;               // number of rows
        int m = matrix[0].length;            // number of columns
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        ArrayList<Integer> ans = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // Traverse from left to right.
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++; // move down to the next row

            // Traverse from top to bottom.
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--; // move left to the previous column

            // Traverse from right to left (if we have remaining rows).
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--; // move up to the previous row
            }

            // Traverse from bottom to top (if we have remaining columns).
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++; // move right to the next column
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans = spiralOrder(matrix);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
