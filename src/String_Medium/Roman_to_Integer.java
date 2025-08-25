package String_Medium;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {
    public int RomanToInt(String s){
        Map<Character,Integer>romanMap=new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int total=0;
        for (int i=0;i<s.length();i++){
            int value=romanMap.get(s.charAt(i));
            if (i+1<s.length() && value<romanMap.get(s.charAt(i+1))){
                total-=value;
            }
            else {
                total+=value;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Roman_to_Integer sol=new Roman_to_Integer();
        String s="IX";
        System.out.println(sol.RomanToInt(s));
    }
}
