package Pattern;
import java.util.Scanner;
public class Num_descending_concentric_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
          for (int j=1;j<=i;j++){
              System.out.print(-(j-n-1));
          }
          for (int j=0;j<=2*n-2*i-2;j++) {
              System.out.print(-(i-n));
          }
          for (int j=i;j>0;j--){
              System.out.print(n-j+1);
          }
            System.out.println();
        }
        for (int i=2;i<=n;i++){
            for (int j=n;j>i;j--){
                System.out.print(j);
            }
           for (int j=0;j<2*i-1;j++){
                System.out.print(i);
            }
           for (int j=i;j<n;j++){
               System.out.print(j+1);
           }
            System.out.println();
        }
    }
}
