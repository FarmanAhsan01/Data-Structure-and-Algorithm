package String;

public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs ){
        if (strs==null||strs.length==0){
            return "";
        }
        String prefix = strs[0];
        for (int i=0;i<strs.length;i++){
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
//                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        longestCommonPrefix sol=new longestCommonPrefix();
        String strs[]={"flower","flow","flight"};
        System.out.println("Input"+" "+strs);
        System.out.println("Output"+" "+sol.longestCommonPrefix(strs));
    }
}
