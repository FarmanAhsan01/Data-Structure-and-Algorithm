package Recursion_ll;
import java.util.ArrayList;
import java.util.List;
public class combinationSumIII {
    public static List<List<Integer>>combinationSum3(int k,int n){
        List<List<Integer>>result=new ArrayList<>();
        findCombination(1,k,n,new ArrayList<>(),result);
        return result;
    }
    public static void findCombination(int start,int k,int target,List<Integer>current,List<List<Integer>>result){
        if (current.size()==k && target==0){
            result.add(new ArrayList<>(current));
        }
        for (int i=start;i<=9;i++){
            current.add(i);
            findCombination(i+1,k,target-i,current,result);
            current.remove(current.size()-1);
        }
    }
    public static void main(String[] args) {
        int k=3;
        int n=7;
        System.out.println(combinationSum3(k,n));
    }
}
