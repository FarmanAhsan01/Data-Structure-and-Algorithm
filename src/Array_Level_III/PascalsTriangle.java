package Array_Level_III;

import java.util.*;

public class PascalsTriangle {

    //first variation of pascale triangle.............................
//    public static long nCr(int row,int coloum){
//      long res=1;
//       for (int i=0;i<coloum;i++){
//           res=res*(row-i);
//           res=res/(i+1);
//       }
//       return res;
//    }
//    public static int pascalTriangle(int row,int coloum){
//       int element=(int) nCr(row-1,coloum-1);
//       return element;
//    }
//    public static void main(String[] args) {
//        int row=5;
//        int coloum=3;
//        System.out.println(pascalTriangle(row,coloum));
//    }

    //second Variation of pascale triangle...............................
    //print n row in pascale triangle..........................................

    //Brute Approach..........................................

//    public static long nCr(int row,int coloum){
//      long res=1;
//       for (int i=0;i<coloum;i++){
//           res=res*(row-i);
//           res=res/(i+1);
//       }
//       return res;
//    }
//    public static void pascalTriangle(int row){
//        for (int i=1;i<=row;i++){
//            System.out.print(nCr(row-1,i-1));
//        }
//        System.out.println();
//
//    }
//    public static void main(String[] args) {
//        int row=5;
//        pascalTriangle(row);
//    }

    //2nd  Variation................................................
    //Optimal Approach..................................
//    public static void nCr(int row){
//        long ans=1;
//        System.out.print(ans);
//       for (int i=1;i<row;i++){
//           ans=ans*(row-i);
//           ans=ans/i;
//           System.out.print(ans);
//       }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        int row=5;
//        nCr(row);
//    }

    //3rd variation..................................................
    //Brute Approach......................................................

//    public static int nCr(int row, int column){
//        long ans=1;
//
//       for (int i=0;i<column;i++){
//           ans=ans*(row-i);
//           ans=ans/(i+1);
//       }
//       return (int) ans;
//    }
//    public static List<List<Integer>>pascalTriangle(int n){
//        List<List<Integer>>ans=new ArrayList<>();
//        for (int row = 1; row <= n; row++) {
//            List<Integer> tempLst = new ArrayList<>(); // temporary list
//            for (int col = 1; col <= row; col++) {
//                tempLst.add(nCr(row - 1, col - 1));
//            }
//            ans.add(tempLst);
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        List<List<Integer>> ans = pascalTriangle(n);
//        for (List<Integer> it : ans) {
//            for (int ele : it) {
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }
//    }
    //OptimalApproach............................................................
    public static List<Integer>generateRow(int row){
        long ans=1;
        List<Integer>ansRow=new ArrayList<>();
        ansRow.add(1);
        for (int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
    public static List<List<Integer>>pascalTriangle(int N){
        List<List<Integer>>ans=new ArrayList<>();
        for (int row=1;row<=N;row++){
            ans.add(generateRow(row));
        }
        return ans;
    }

    public static void main(String[] args) {
        int N=5;
        List<List<Integer>>ans= pascalTriangle(N);
        for (List<Integer>it:ans){
            for (int ele:it){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
