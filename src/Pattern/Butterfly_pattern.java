package Pattern;
import java.util.Scanner;
public class Butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        for (int i=0;i<10;i++){
            if (i >= 5) {
                for (int j=9;j>i;j--){
                    System.out.print("*");
                }
                for (int j=-1;j<=2*i-10;j++){
                    System.out.print(" ");
                }
                for (int j=9;j>i;j--){
                    System.out.print("*");
                }

            }
            else {
                for (int j=0;j<=i;j++){
                    System.out.print("*");
                }
                for (int j=0;j<2*(5-i-1);j++){
                    System.out.print(" ");
                }
                for (int j=0;j<=i;j++){
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
