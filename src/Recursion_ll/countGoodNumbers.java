package Recursion_ll;

public class countGoodNumbers {
    static final long MOD = 1000000007;
    public static long pow(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if (exp %2 == 1) {   // if exp is odd
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;  // square the base
            exp >>= 1;  // divide exponent by 2
        }
        return result;
    }

    public static int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2;   // count of even indices (0,2,4,...)
        long oddPositions = n / 2;          // count of odd indices (1,3,5,...)

        long pow5 = pow(5, evenPositions);  // at even positions → 5 choices (0,2,4,6,8)
        long pow4 = pow(4, oddPositions);   // at odd positions → 4 choices (2,3,5,7)

        return (int)((pow5 * pow4) % MOD);  // multiply and mod
    }

    public static void main(String[] args) {
        long n1 = 1;
        System.out.println("Input: " + n1);
        System.out.println("Output: " + countGoodNumbers(n1));  // Expected: 5

        // Example 2
        long n2 = 4;
        System.out.println("\nInput: " + n2);
        System.out.println("Output: " + countGoodNumbers(n2));  // Expected: 400

        // Try your own input
        long n3 = 50;
        System.out.println("\nInput: " + n3);
        System.out.println("Output: " + countGoodNumbers(n3));
    }
}
