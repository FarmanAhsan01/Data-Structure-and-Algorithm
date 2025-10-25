package Bit_Manipulation;

public class minimumBitFlipsToConvertNumber {
    public static int minFlips(int start,int goal){
        int ans=start^goal;
        int cnt=0;
        for (int i=0;i<=31;i++){
            if((ans&(1<<i))!=0){
                cnt=cnt+1;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int start=10;
        int goal=7;
        System.out.println(minFlips(start,goal));
    }

}
