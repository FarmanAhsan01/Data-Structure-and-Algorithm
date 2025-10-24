package Bit_Manipulation;

import javax.swing.plaf.basic.BasicBorders;
import java.util.Arrays;

public class basic_Bit_questions {
    //Swap Two Number...................................................
//    public static int [] swap(int x,int y){
//        x=x^y;
//        y=x^y;
//        x=x^y;
//
//        return new int[]{x,y};
//    }
//
//    public static void main(String[] args) {
//        int x=5;
//        int y=9;
//        System.out.println(Arrays.toString(swap(x,y)));
//    }
    //check if the ith bit is set or not.............................................

    //using left shift.
//    public static boolean checkithSet(int N,int i){
//        if ((N&(1<<i))!=0){
//            return true;
//        }
//        return false;
//    }
    //using right shift.
//    public static boolean checkithSet(int N,int i){
//        if (((N>>i)&1)==0){
//            return false;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        int N=13;
//        int i=2;
//        System.out.println(checkithSet(N,i));
//    }

    //set the ith bit.................................................
//    public static int setithBit(int N,int i){
//        N=N|(1<<i);
//        return N ;
//    }
//    public static void main(String[] args) {
//        int N=9;
//        int i=2;
//        System.out.println(setithBit(N,i));
//    }

    //clear the ith bit....................................
//    public static int ithBit(int N,int i){
//        N=N&~(1<<i);
//        return N;
//    }
//    public static void main(String[] args) {
//        int N=13;
//        int i=2;
//        System.out.println(ithBit(N,i));
//    }

    //Toggle the ithBit
//    public static int toggleithBit(int N,int i){
//        N=N^(1<<i);
//        return N;
//    }
//
//    public static void main(String[] args) {
//        int N=13;
//        int i=2;
//        System.out.println(toggleithBit(N,i));
//    }

    //Remove the last set bit(rightmost)
//    public static int removeLastSetBit(int N){
//         N=N&-(N-1);
//        return N;
//    }
//
//    public static void main(String[] args) {
//        int N=40;
//        System.out.println(removeLastSetBit(N));
//    }

    //check if the number is a power of 2........................
//    public static boolean isPowerBy2(int N){
//     if(n==0 ||n<0){
//        return false;
//    }
//        if ((N&(N-1))==0){
//            return true;
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        int N=32;
//        System.out.println(isPowerBy2(N));
//    }

    //Count the number of set bill..........
    public static int countSetBits(int n){
        int cnt=0;
//        while(n>1){
//            if (n%2==1){
//                cnt=cnt+1;
//            }
//            n=n/2;
//        }
//        while (n>1){
//            cnt+=n&1;
//            n=n>>1;
//        }
//        if (n==1){
//            cnt+=1;
//        }
//        optimise version..........................
        while(n!=0){
            n=n&(n-1);
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int N=13;
        System.out.println(countSetBits(N));
    }


}
