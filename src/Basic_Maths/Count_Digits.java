package Basic_Maths;
import java.util.Scanner;
public class Count_Digits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int originalNum=N;
        int count=0;
        int lastDigit=0;
        while(N>0){
            lastDigit=N%10;
            N=N/10;
            if(lastDigit!=0&&originalNum%lastDigit==0){
                count++;
            }
        }
        System.out.println(count);

    }

}

