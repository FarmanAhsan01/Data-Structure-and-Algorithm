package String;

import Recursion.REcursion_print_String;

public class Remove_Outermost_paranthesis {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) {
                    sb.append(ch);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Remove_Outermost_paranthesis sol = new Remove_Outermost_paranthesis(); // create object of Solution class

        String s = "(()())(())";       // input string
        String result = sol.removeOuterParentheses(s); // call method

        System.out.println("Input: " + s);
        System.out.println("Output: " + result);
    }
}
