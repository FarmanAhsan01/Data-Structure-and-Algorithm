package Binary_Search_on_2D_Arrays;

import java.util.Arrays;

public class find_peak_element_in_a_matrix {
    public static int maxElem(int matrix[][],int n,int m,int mid){
        int maxRow=0;
        for (int i=0;i<n;i++){
            if (matrix[i][mid]>matrix[maxRow][mid]){
                maxRow=i;
            }

        }
        return maxRow;
    }

    public static  int[] peakElement(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;int high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int maxRow=maxElem(matrix,n,m,mid);
            int left=(mid-1>=0)?matrix[maxRow][mid-1]:-1;
            int right=(mid+1<m)?matrix[maxRow][mid+1]:-1;

            if (matrix[maxRow][mid]>left && matrix[maxRow][mid]>right){
                return new int[]{maxRow,mid};
            }
            else if (left>matrix[maxRow][mid]) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int matrix[][]={{4,2,5,1,4,5},{2,9,3,2,3,2},{1,7,6,0,1,3},{3,6,2,3,7,2}};

        System.out.println(Arrays.toString(peakElement(matrix)));

    }
}
