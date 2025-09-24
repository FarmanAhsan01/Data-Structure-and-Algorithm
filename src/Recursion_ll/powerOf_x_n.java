package Recursion_ll;

public class powerOf_x_n {
    public static double myPow(double x,int n){
        long nn=n;
        if (nn<0){
            nn=-1*nn;
            return 1.0 / power(x,nn);
        }
        return power(x,nn);
    }
    public static double power(double x,long n){
        if (n==0) return 1.0;
        double half=power(x,n/2);
        if (n%2==0){
            return half*half;
        }
        else {
            return half*half*x;
        }
    }
    public static void main(String[] args) {
        double x=2.00000;
        int n=10;
        System.out.println(myPow(x,n));
    }
}
