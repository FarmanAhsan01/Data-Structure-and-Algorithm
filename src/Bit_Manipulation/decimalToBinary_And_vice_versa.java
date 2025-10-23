package Bit_Manipulation;

import java.util.Arrays;

public class decimalToBinary_And_vice_versa {

    //Decimal to Binary.......................................................
//    public static String decTobi(int x){
//        String res="";
//        while(x>0){
//            if (x%2==1) res+="1";
//            else res+="0";
//            x=x/2;
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//        int x=9;
//        StringBuilder sb=new StringBuilder( decTobi(x));
//        sb.reverse();
//        String reversedString=sb.toString();
//        System.out.println(reversedString);
//    }

    //Binary to Decimal ..........................................
    public static int biToDec(String x){
        int len=x.length();
        int p2=1;
        int num=0;
        for (int i=len-1;i>=0;i--){
            if (x.charAt(i)=='1'){
                num=num+p2;
            }
            p2=p2*2;
        }
        return num;
    }

    public static void main(String[] args) {
        String x="0111";
        System.out.println( biToDec(x));
    }

}
