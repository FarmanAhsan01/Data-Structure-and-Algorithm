package Basic_Maths;
import java.util.Scanner;


    class LCM_and_GCD {

        class Solution {
            static Long[] lcmAndGcd(Long A , Long B) {
                // code here
                Long[] LCMandHCF = new Long[2];
                long result = gcd(A,B);
                long LCM = A*B/result;
                LCMandHCF[0] = LCM;
                LCMandHCF[1] = result;
                return LCMandHCF;
            }

            public static long gcd(Long A,Long B) {
                long reminder = 1;

                while(A!= 0 && B!=0){
                    if(A>B){
                        reminder = A%B;
                        A=reminder;
                    }
                    else{
                        reminder = B%A;
                        B=reminder;
                    }
                }
                if(A==0){
                    return B;
                }
                else{
                    return A;
                }

            }
        };

//        static int gcd(int a,int b){
//            while(a>0&&b>0){
//                if(a>b){
//                    a=a%b;
//                }
//                else{
//                    b=b%a;
//                }
//            }
//            if(a==0){
//                return b;
//            }
//            return a;
//        }
//
//        public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter the first number:");
//            int A=sc.nextInt();
//            System.out.println("Enter the second number:");
//            int B=sc.nextInt();
//            System.out.println(LCM_and_GCD.gcd(A,B));
//        }
//        static Long[] lcmAndGcd(Long A, Long B) {
//            long factor = 0;
//            long mul = 1;
//            for (int i = 1; i <= Math.min(A, B); i++) {
//                if (A % i == 0 || B % i == 0) {
//                    factor = i;
//                    mul = mul * i;
//                }
//            }
//            return new Long[]{factor, mul};
//
//        }
//
//        public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter the first number:");
//            int A=sc.nextInt();
//            System.out.println("Enter the second number:");
//            int B=sc.nextInt();
//            Long[] result = LCM_and_GCD.lcmAndGcd(10L, 5L);
//            System.out.println("GCD: " + result[0] + ", LCM: " + result[1]);
//        }
    }


//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the first number");
//        int n=sc.nextInt() ;
//        System.out.println("enter the second number");
//        int m=sc.nextInt() ;
//        int factor=0;
//        int mul=1;
//        for(int i=1;i<=Math.min(n,m);i++){
//            if(n%i==0||m%i==0){
//                factor=i;
//                mul=mul*factor;
//            }
//        }
//        System.out.println("GCD of number is:"+factor+" lcm is"+mul);
//    }

//}
