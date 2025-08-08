package Pattern;
//import java.util.Scanner;
public class Diamond_Hole_pattern {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        for (int i=0 ;i<10; i++){
            if (i >= 5) {
                for (int j=5; j<=i;j++){
                    System.out.print("*");
                }
                for (int j=0;j<2*(2*5-i-1);j++){
                    System.out.print(" ");
                }
                for (int j=5;j<=i;j++){
                    System.out.print("*");
                }
            }
            else {
                for (int j=5 ;j>i; j--){
                    System.out.print("*");
                }
                for (int j=1; j<=2*i;j++){
                    System.out.print(" ");
                }
                for (int k=5; k>i ; k--){
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
