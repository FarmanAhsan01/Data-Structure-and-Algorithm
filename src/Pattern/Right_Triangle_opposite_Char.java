package Pattern;
import java.util.Scanner;
public class Right_Triangle_opposite_Char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for (char ch = (char) ('E'-i); ch<='E'; ch++){
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
