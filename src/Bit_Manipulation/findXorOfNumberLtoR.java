package Bit_Manipulation;

public class findXorOfNumberLtoR {
    //Brute Approach..............................
//    public static int xorOfNumber(int n){
//        int xor=0;
//        for (int i=1;i<=n;i++){
//            xor=xor^i;
//        }
//        return xor;
//    }
    //Optimal Approach..............................

    //for range L to R............................
    public static int xorOfNumber(int n){
        if (n%4==1){
            return 1;
        }
        else if (n%4==2) {
            return n+1;
        }
        else if (n%4==3){
            return 0;
        }
        return n;
    }
    public static int findRangeXor(int l,int n){
        return xorOfNumber(l-1)^xorOfNumber(n);
    }
    public static void main(String[] args) {
        int l=3;
        int n=8;
        System.out.println(findRangeXor(l,n));
    }
}
