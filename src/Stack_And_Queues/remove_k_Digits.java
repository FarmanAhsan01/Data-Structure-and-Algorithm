package Stack_And_Queues;

import java.util.Stack;

public class remove_k_Digits {
    public static String kDigits(String str, int k){
        int n=str.length();
        Stack<Character>st=new Stack<>();
        for (int i=0;i<n;i++){
            char digit=str.charAt(i);
            // Pop last digits if a smaller digit is found and k > 0
            while (!st.isEmpty() && k>0 && st.peek()>digit) {
                st.pop();
                k--;
            }
            // Push the current digit

            st.push(digit);
        }
        while (k>0){
            st.pop();
            k--;
        }
        if (st.isEmpty()){
            return "0";
        }
        StringBuilder res=new StringBuilder();

        while (!st.isEmpty()){
            res.append(st.pop());
        }

        // Reverse the string to get the correct number
        res.reverse();

        // If result is empty, return "0"
        if (res.length() == 0) return "0";

        // Return the result as a string
        return res.toString();

    }
    public static void main(String[] args) {
        String str="1432219";
        int k=3;
        System.out.println(kDigits(str,k));
    }
}
