package String_Medium;

public class stringToInteger {
    public int myAtoi(String s){
        if (s==null || s.length()==0){
            return 0;
        }
        int i=0;
        int n=s.length();

        //for whiteSpace

        while (i<n && s.charAt(i)==' ') {
            i++;
        }
        if (i==n) return 0;

        //handle sign
        int sign=1;
        if (s.charAt(i)=='-'||s.charAt(i)=='+'){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }

        //convert digit to integer
        long result=0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

            // 4. Clamp the value if it goes out of 32-bit range
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (sign * result);
    }
    public static void main(String[] args) {
        stringToInteger sol=new stringToInteger();
        System.out.println(sol.myAtoi("42"));              // 42
        System.out.println(sol.myAtoi("   -42"));          // -42
        System.out.println(sol.myAtoi("4193 with words")); // 4193
        System.out.println(sol.myAtoi("words and 987"));   // 0
        System.out.println(sol.myAtoi("-91283472332"));    // -2147483648 (clamped)
        System.out.println(sol.myAtoi("91283472332"));     // 2147483647 (clamped)
        System.out.println(sol.myAtoi("000000000001234")); // 1234
    }
}
