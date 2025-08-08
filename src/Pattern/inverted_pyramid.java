package Pattern;

import java.util.Scanner;
public class inverted_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<2*n-(2*i+1);k++){
                System.out.print("*");
            }
            for (int z=0;z<i;z++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
