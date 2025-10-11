package Recursion_ll;

import LinkedList.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfaPhoneNumber {
    public static List<String>letterCombination(String digits){
        List<String>result =new ArrayList<>();
        if (digits == null|| digits.length()==0){
            return result;
        }
        String[] mapping={
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        backtrack(0,digits,new StringBuilder(),result,mapping);
        return result;
    }
    private static void backtrack(int index,String digits,StringBuilder current,List<String>result,String[] mapping){
        if (index ==digits.length()){
            result.add(current.toString());
            return;
        }
        String letter=mapping[digits.charAt(index)-'0'];
        for (char c:letter.toCharArray()){
            current.append(c);
            backtrack(index+1,digits,current,result,mapping);
            current.deleteCharAt(current.length()-1);
        }
    }
    public static void main(String[] args) {
        String digits="23";
        System.out.println(letterCombination(digits));
    }
}
