package Recursion;

import java.util.Scanner;

public class Recursion_n_to_1 {
        public  void printNos(int n) {
            // Your code here
            if(n<=1){
                System.out.print(n);
                return ;
            }
            System.out.print(n+" ");
            n-=1;
            printNos(n);
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Recursion_n_to_1 farry=new Recursion_n_to_1();
            farry.printNos(n);
        }
    }




