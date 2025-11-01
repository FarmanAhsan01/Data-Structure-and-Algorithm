package Bit_Manipulation;

public class powerExponentiation {
    public static double power(double x,long n){
        double ans=1;
        if (n<0){
            x=1/x;
            n=-n;
        }
        while (n>0){
            if (n%2==1){
                ans=ans*x;
                n=n-1;
            }
            else {
                n=n/2;
                x=x*x;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int x=2;
        int n=-2;
        System.out.println(power(x,n));
    }
}
