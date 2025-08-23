package String;

public class isIsomorphic_String {
    public boolean isomorohic(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] mapS=new int[256];
        int[] mapT=new int[256];

        for (int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if (mapS[c1]!=mapT[c2]){
                return false;
            }
            mapS[c1]=i+1;
            mapT[c2]=i+1;

        }
        return  true;
    }
    public static void main(String[] args){
        isIsomorphic_String sol=new isIsomorphic_String();
        String s="egg";
        String t="add";
        System.out.println("Input :"+s+" "+t);
        System.out.println("Output :"+sol.isomorohic(s,t));
    }

}
