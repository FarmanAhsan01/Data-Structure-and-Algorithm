package Array_Level_II;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.ZipError;

public class setMatrixZeroes {
//    static void marksRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
//        for (int j=0;j<m;j++){
//            if (matrix.get(i).get(j) != 0) {
//                matrix.get(i).set(j, -1);
//            }
//        }
//    }
//    static void marksCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
//
//        for (int i=0;i<n;i++){
//            if (matrix.get(i).get(j) != 0) {
//                matrix.get(i).set(j, -1);
//            }
//        }
//    }
//    static ArrayList<ArrayList<Integer>> setZeroe(ArrayList<ArrayList<Integer>> matrix, int n, int m){
//
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                if (matrix.get(i).get(j) == 0) {
//                    marksRow(matrix, n, m, i);
//                    marksCol(matrix, n, m, j);
//                }
//            }
//        }
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                if (matrix.get(i).get(j) == -1) {
//                    matrix.get(i).set(j, 0);
//                }
//            }
//        }
//        return matrix;
//    }
//    public static void main(String[] args) {
////        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
////        setZeroes(arr);
//
//        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
//        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
//        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
//        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
//
//        int n= matrix.size();
//        int m=matrix.get(0).size();
//        ArrayList<ArrayList<Integer>>ans=setZeroe(matrix,n,m);
//
//        for (ArrayList<Integer> row : ans) {
//            for (Integer ele : row) {
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }
//    }

    //BETTER APPROACH........................................................
//    public static ArrayList<ArrayList<Integer>>zeroMatrix(ArrayList<ArrayList<Integer>>matrix,int n,int m){
//        int []row=new int[n];
//        int []col=new int[m];
//
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                if (matrix.get(i).get(j)==0){
//                    row[i]=1;
//                    col[j]=1;
//                }
//            }
//        }
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                if (row[i]==1||col[j]==1){
//                    matrix.get(i).set(j,0);
//                }
//            }
//        }
//        return matrix;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>>matrix=new ArrayList<>();
//        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
//        matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
//        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
//
//        int n= matrix.size();
//        int m=matrix.get(0).size();
//        ArrayList<ArrayList<Integer>>ans= zeroMatrix(matrix,n,m);
//        for (ArrayList<Integer>row:ans){
//            for (Integer ele:row){
//                System.out.print( ele+" ");
//            }
//            System.out.println();
//        }
//    }

    //Optimal Approach......................................................
    public static ArrayList<ArrayList<Integer>>zeroMatrix(ArrayList<ArrayList<Integer>>matrix,int n,int m ){
        int col0=1;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (matrix.get(i).get(j)==0){
                    matrix.get(i).set(0,0);
                }
                if (j!=0){
                    matrix.get(0).set(j,0);
                }
                else {
                    col0=0;
                }
            }
        }
        for (int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                if (matrix.get(i).get(j) != 0) {
                    if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }
        if (matrix.get(0).get(0)==0){
            for (int j=0;j<m;j++){
                matrix.get(0).set(j,0);
            }
        }
        if (col0==0){
            for (int i=0;i<n;i++){
                matrix.get(i).set(0,0);
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>matrix=new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,1,1,1)));
        int n= matrix.size();
        int m=matrix.get(0).size();
        ArrayList<ArrayList<Integer>>ans=zeroMatrix(matrix,n,m);
        for (ArrayList<Integer>row:ans){
            for (Integer ele:row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
