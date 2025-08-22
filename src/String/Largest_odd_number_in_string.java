package String;

public class Largest_odd_number_in_string {
    public String largestOddNumber(String s){
        for (int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if (ch%2==1){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args){
        Largest_odd_number_in_string sol=new Largest_odd_number_in_string();
        String s="52";
        System.out.println("Input" +" "+s);
        System.out.println("Output" + " "+sol.largestOddNumber(s));

    }

}
