package Bit_Manipulation;

public class divideTwoInteger {
    public static int divide(int dividend,int divisor){
        if (dividend==divisor) return 1;

        boolean isPositive=true;
        if (dividend>=0 && divisor<0){
            isPositive=false;
        }
        if (dividend<0 && divisor>0){
            isPositive=false;
        }
        long n=Math.abs(dividend);
        long d=Math.abs(divisor);
        long ans=0;
        long cnt=0;
        while (n>=d){
            cnt=0;
            while (n>=(d<<(cnt+1))){
                cnt++;
            }
            ans+=(1<<cnt);
            n=n-(d*(1<<cnt));
        }
        if (ans>=Integer.MAX_VALUE && isPositive==true){
            return Integer.MAX_VALUE;
        }
        if (ans>=Integer.MAX_VALUE && !isPositive==false) {
            return Integer.MIN_VALUE;
        }
        return isPositive?(int)ans:(int)(-1*ans);
    }
    public static void main(String[] args) {
        int dividend = 100, divisor = 10;
        System.out.println(divide(dividend,divisor));
    }
}
