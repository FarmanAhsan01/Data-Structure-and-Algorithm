package Pattern;
import java.util.Scanner;
public class character_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';
        for (int i=0;i<n;i++){
            for (int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            int breakpoint=(2*i+1)/2;
            for (int j=0;j<2*i+1;j++){

                if (j<=breakpoint){
                    ch++;
                }
                else {
                    ch--;
                }
                System.out.print(ch);


            }
            for (int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
