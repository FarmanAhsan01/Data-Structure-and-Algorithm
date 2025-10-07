package Basic_Maths;
import java.util.Scanner;
public class prime_Number {
//        public static boolean isPrime(int n) {
//            if (n <= 1) {
//                return false; // Numbers less than or equal to 1 are not prime
//            }
//
//            // Check divisors from 2 up to n / 2
//            for (int i = 2; i <= n /2; i++) {
//                if (n % i == 0) {
//                    return false; // If n is divisible by i, it's not prime
//                }
//            }
//
//            return true; // If no divisors were found, n is prime
//        }
//
//        public static void main(String[] args) {
//            int number = 29; // Change this to any number you want to check
//            if (isPrime(number)) {
//                System.out.println(number + " is a prime number.");
//            } else {
//                System.out.println(number + " is not a prime number.");
//            }
//        }
    public static Boolean isPrime(int num) {

      if(num<=1){
        return false;
      }

      for(int i=2;i<=num/2;i++){
        if(num%i==0){
            return false;
        }
     }
      return true;          
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println("YES");
        }
        else {
            System.out.println("no");
        }
    }
}


