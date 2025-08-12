package Recursion;

import java.util.Scanner;

public class Recursion_1_to_n {
        int count=1;

        public  void printNos(int n) {
            // Your code here
            if(count==n){
                System.out.print(count);
                return ;
            }
            System.out.print(count);
            count++;
            printNos(n);
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Recursion_1_to_n farry=new Recursion_1_to_n();
            farry.printNos(n);
        }
    }


