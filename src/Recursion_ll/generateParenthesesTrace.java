package Recursion_ll;
import java.util.ArrayList;
import java.util.List;
public class generateParenthesesTrace {
    public static List<String> generateParenthesis(int n){
        List<String> result= new ArrayList<>();
        backtrack(result, "", 0, 0, n, 0);
        return result;
    }
    private static void backtrack(List<String> result, String current, int open,int close,int n,int depth){

        System.out.println("Depth "+depth+"| current=\""+current+"\",open="+open+",close="+close);

        if (current.length() == 2 * n) {
            result.add(current);
            System.out.println("✅ Added: " + current);
            return;
        }
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n, depth + 1);
        }

        // Option 2: Add ")" if valid (close < open)
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n, depth + 1);
        }

    }
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println("\nFinal Result: " + result);
    }
}
