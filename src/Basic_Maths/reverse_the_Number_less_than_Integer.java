package Basic_Maths;
import java.util.Scanner;
class Solution{
    public static int reverse(int n){
        long result = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            result = result * 10 + lastDigit;
            n = n/ 10;


            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) result;
    }
}
public class reverse_the_Number_less_than_Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Solution.reverse(n));

    }
}
