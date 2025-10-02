package Recursion_ll;

public class generateAllBinaryStrings {
    public static void generateBinary(int n,String Current){
        if (Current.length()==n){
            System.out.println(Current);
            return;
        }
        generateBinary(n,Current+"0");
        generateBinary(n,Current+"1");
    }

    public static void main(String[] args) {
        int n=3;
        generateBinary(n,"");
    }
}
