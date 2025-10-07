package Basic_Maths;
import java.util.Scanner;
 class palindrome {
//    public static boolean palindrome(long n){
//        long result=0;
//        long original=n;
//        while(n!=0){
//            long lastDigit=n%10;
//            result=result*10+lastDigit;
//            n=n/10;
//        }
//
//        return result==original;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(palindrome(n));
//
//
//    }
//}
//import java.util.Scanner;
//class Solution {
    public static boolean isPalindrome(int x) {
        long reverse=0;
        long original=x;
        while(x>0){
            long lastDigit=x%10;
            reverse=reverse*10+lastDigit;
            x=x/10;
        }
        return original==reverse;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(isPalindrome(x));
    }
}
