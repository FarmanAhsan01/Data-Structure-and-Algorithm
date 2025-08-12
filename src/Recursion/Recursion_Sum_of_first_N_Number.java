package Recursion;
import java.util.Scanner;
public class Recursion_Sum_of_first_N_Number {
    long sum=0;
    long count=1;
    long sumOfN(long n){
        if(count==n+1){
            return sum;
        }
       long mul=count*count*count;
        sum+=mul;
        count++;
        return sumOfN(n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Recursion_Sum_of_first_N_Number shaffy=new Recursion_Sum_of_first_N_Number();
        System.out.println(shaffy.sumOfN(n));
    }

}
