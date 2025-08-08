package Pattern;

import java.util.Scanner;
public class inverse_L_H_Num_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=n; j>=i; j--){
                System.out.print( -(j-n-1) );
            }
            System.out.println();
        }
    }
}
