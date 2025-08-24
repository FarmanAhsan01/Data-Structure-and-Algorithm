package String_Medium;

public class maximumNestedDepthOfTheParentheses {
    public int maxDepth(String s){
        int count=0;
        int max=0;
        for (int c:s.toCharArray()){
            if (!(c[0] == '(')){
                count=0;
            }
            if(c=='('){
                count++;
            }
            else if (c==')'){
                max=Math.max(max,count);
                count--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        maximumNestedDepthOfTheParentheses sol=new maximumNestedDepthOfTheParentheses();
        String s="1";
        System.out.println(sol.maxDepth(s));
    }
}
