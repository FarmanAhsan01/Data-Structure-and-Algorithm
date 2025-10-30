package Bit_Manipulation;

import java.util.ArrayList;
import java.util.List;

public class allDivisorsOfaNumber{
    //Brute Approach..............
//    public static List<Integer>allDivisors(int n){
//        List<Integer>list=new ArrayList<>();
//        for (int i=1;i<=n;i++){
//            if (n%i==0){
//                list.add(i);
//            }
//        }
//        return list;
//    }

    public static List<Integer>allDivisors(int n){
        List<Integer>list=new ArrayList<>();
        for (int i=1;i*i<=n;i++){
            if (n%i==0){
                list.add(i);
                if (n/i!=i){
                    list.add(n/i);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int n=36;
        List<Integer>result=allDivisors(n);
        for (int it:result){
            System.out.println(it);
        }
    }
}
