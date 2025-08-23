package String;

import java.util.Arrays;

public class Check_if_two_strings_are_anagram {
    public  boolean isAnagram(String s,String t){
        if (s.length()!=t.length()){
            return false;
        }
        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr,tArr);
    }
    public static void main(String[] args) {
        Check_if_two_strings_are_anagram sol=new Check_if_two_strings_are_anagram();
        String s="anagram";
        String t="nagaram";
        System.out.println(sol.isAnagram(s,t));
    }
}
