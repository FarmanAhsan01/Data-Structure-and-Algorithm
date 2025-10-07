package Basic_Maths;
import java.util.Scanner;
public class Sum_of_divisor {
        public static int sumOfAllDivisors(int n){
            int sum=0;
//            int div=0;
//            for(int i=1;i<=n;i++){
//                for(int j=1;j<=n;j++){
//                    if(i%j==0){
//                        sum+=i;
//                    }
//                }
//
//            }
//            return sum;
            for(int i=1;i<=n;i++){
                sum=sum+(n/i)*i;
            }

            return sum;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        System.out.println(Sum_of_divisor.sumOfAllDivisors(n);
    }
}
