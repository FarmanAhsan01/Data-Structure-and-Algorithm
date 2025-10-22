package Recursion_ll;

import java.util.ArrayList;
import java.util.List;

public class expressionAddOperators {
    public void dfs(String num, int target, int start, long current_value, long last_operand, String expression, List<String>result){
        if (start ==num.length()){
            if (current_value==target){
                result.add(expression);
            }
            return;
        }
        for (int i=start;i<num.length();i++){
            if (i>start && num.charAt(start)=='0'){
                return;
            }
            String current_num=num.substring(start,i+1);
            long current_num_val=Long.parseLong(current_num);

            if (start==0){
                dfs(num,target,i+1,current_num_val,current_num_val,current_num,result);
            }
            else {
                dfs(num,target,i+1,current_value+current_num_val,current_num_val,expression+"+"+current_num,result);
                dfs(num,target,i+1,current_value-current_num_val,-current_num_val,expression+"-"+current_num,result);
                dfs(num,target,i+1,current_value-last_operand+last_operand*current_num_val,last_operand*current_num_val,expression+"*"+current_num,result);
            }
        }
    }
    public List <String>addOperators(String num,int target){
        List<String>result=new ArrayList<>();
        dfs(num,target,0,0,0,"",result);
        return result;
    }

    public static void main(String[] args) {
        String num = "123";
        int target = 6;
        expressionAddOperators sol = new expressionAddOperators();

        List<String> result = sol.addOperators(num, target);

        for (String expr : result) {
            System.out.print(expr + " ");
        }
    }
}
