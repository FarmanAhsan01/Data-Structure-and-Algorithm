package String;

public class Reverse_words_in_string {
    public String reverseWords(String s){
        String[] words=s.trim().split("\\s");

        StringBuilder result =new StringBuilder();
        for (int i= words.length-1;i>=0;i--){
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args){
        Reverse_words_in_string sol=new Reverse_words_in_string();
        String s="the sky is blue";
        System.out.println("Input: " + s);
        System.out.println("Output: " + sol.reverseWords(s));
    }
}
