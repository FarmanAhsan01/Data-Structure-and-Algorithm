package Recursion;

import java.util.Scanner;

public class REcursion_print_String {
        int count=1;
        void printGfg(int N) {
            // Your code here
            if (count == N) {
                System.out.print("GFG");
                return;
            }
            count++;
            if (count!=1) {
                System.out.print("GFG ");
            }
            printGfg(N);
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            REcursion_print_String farry=new REcursion_print_String();
            farry.printGfg(N);
        }
        //second method
//    void func( i, n )
//    {
//        if(i>n) return;
//        print(“Raj”);
//        f( i+1,N );
//    }
//    main()
//    {
//        int n;
//        input(n);
//        f(1,n);
//    }
//
}
