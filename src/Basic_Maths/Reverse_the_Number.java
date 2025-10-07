package Basic_Maths;
import java.util.Scanner;
public class  Reverse_the_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=0;
        int lastDigit;
       while(n>0){
            lastDigit =n%10;
            if (lastDigit==0){
                System.out.print(0);
            }
           else{
               num=num*10+lastDigit;
            }
            n=n/10;
       }
        System.out.println(num);
    }
}
