package Bit_Manipulation;

import javax.swing.*;
import java.beans.Introspector;
import java.util.ArrayList;
import java.util.List;

public class printPrimeFactorOfNumber {

    public static boolean isPrime(int N){
       if (N<2) return false;
        for (int i=2;i*i<=N;i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
//    public static List<Integer>primeFactor(int n){
//        List<Integer>list=new ArrayList<>();
//        for (int i=2;i<n;i++){
//            if (n%i==0 && isPrime(i)){
//                list.add(i);
//            }
//        }
//        return list;
//    }


    //Brute II Approach.............................................
//    public static List<Integer>primeFactor(int N){
//        List<Integer>list=new ArrayList<>();
//        for (int i=2;i*i<=N;i++){
//            if (N%i==0){
//                if (isPrime(i)) list.add(i);
//                int other=N / i;
//                if (other != i && isPrime(other)) {
//                    list.add(other);
//                }
//            }
//        }
//        return list;
//    }

    //Optimal Approach...........................
//    public static List<Integer>primeFactor(int N){
//        List<Integer>list=new ArrayList<>();
//        for (int i=2;i<=N;i++){
//            if (N%i==0){
//                list.add(i);
//                while(N%i==0){
//                    N=N/i;
//                }
//            }
//        }
//        return list;
//    }

    //most optimal Approach
    public static List<Integer>primeFactor(int N){
        List<Integer>list=new ArrayList<>();
        for (int i=2;i*i<=N;i++){
            if (N%i==0){
                list.add(i);
                while(N%i==0){
                    N=N/i;
                }
            }
        }
        if (N!=1) list.add(N);
        return list;
    }

    public static void main(String[] args) {
        int nums=780;
        List<Integer>result=primeFactor(nums);
        System.out.println(result);
    }
}
