package Recursion;
import java.util.Scanner;
public class FIbonacci_Number {

    public int fib(int n) {
        int fibo=0;
        if(n==0){
           return 0;
        } else if (n==1) {
           return 1;
        }
        fibo+=fib(n-1)+fib(n-2);
       return fibo;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        FIbonacci_Number shaffy=new FIbonacci_Number();
        System.out.println(shaffy.fib(n));
    }
}
