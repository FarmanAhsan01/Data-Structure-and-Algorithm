package Basic_Maths;
import java.util.Scanner;
public class Bit_32_reverse {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        long result =0;
        for(int i=0;i<32;i++){
            long lsb=n&1;
            long rev=lsb<<(31-i);
            result=result|rev;
            n=n>>1;
        }
        System.out.println(result);
    }
}
