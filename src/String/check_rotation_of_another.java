package String;

public class check_rotation_of_another {
    public boolean rotateString(String s,String goal){
        if (s.length()!=goal.length()){
            return false;
        }

        String doubled=s+s;
        return doubled.contains(goal);
    }
    public static void main(String[] args){

        check_rotation_of_another sol=new check_rotation_of_another();
        String s="abcde";
        String goal="cdeab";
        System.out.println("Input :"+s +goal);
        System.out.println("Output :"+sol.rotateString(s,goal));
    }
}
