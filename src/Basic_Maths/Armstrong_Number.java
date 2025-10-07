package Basic_Maths;

import java.util.Scanner;

public class Armstrong_Number {
//    public static boolean armstrong(int n){

//        return Arm==Number;
//    }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the armstrong number:");
            int n=sc.nextInt();
            int Arm=0;
            int Number=n;
            int count=0;
            int temp=n;
            while(n>0){
                n=n/10;
                count++;
            }

            while (temp>0){
                int lastDigit=temp%10;
                Arm+=Math.pow(lastDigit,count);
                temp=temp/10;
            }
            if (Arm==Number) {
                System.out.println("True");

            }
            else {
                System.out.println("False");

            }

        }
    }


