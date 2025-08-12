package Recursion;
import java.util.Scanner;
import java.util.ArrayList;
public class Recursion_factorial_of_Number_using_Array_list {

    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> factorialList = new ArrayList();

        long index = 1;
        long factorial = 1;
        while (n >= factorial) {
            factorialList.add(factorial);
            index++;
            factorial *= index;
        }
        return factorialList;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Recursion_factorial_of_Number_using_Array_list.factorialNumbers(n));
    }
}
