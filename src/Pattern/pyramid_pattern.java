package Pattern;

import java.util.Scanner;
public class pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0; i<n; i++){
           for (int j=0;j<n-i-1;j++){
               System.out.print(" ");
           }
           for (int k=0;k<2*i+1;k++){
               System.out.print("*");
           }
           for(int z=0;z<n-i-1;z++){
               System.out.print(" ");
           }
            System.out.println();
        }
    }
}
