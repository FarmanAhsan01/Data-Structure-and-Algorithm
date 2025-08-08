package Pattern;
import java.util.Scanner;
public class Inverse_Left_Char_Right_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=n; i>0; i--){
            char ch='A';
            for (char j=1; j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
