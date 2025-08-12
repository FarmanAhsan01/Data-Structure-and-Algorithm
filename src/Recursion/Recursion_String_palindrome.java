package Recursion;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start=0;
        int end=s.length()-1;
        if(s.equals(" ")){
            return true;
        }
        while(start<end){
           if (s.charAt(start)!=s.charAt(end)){
               return false;
           }start++;
            end--;

        }
        return true;
    }
}
public class Recursion_String_palindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        Solution farry=new Solution();
        System.out.println(farry.isPalindrome(s));
    }
}
