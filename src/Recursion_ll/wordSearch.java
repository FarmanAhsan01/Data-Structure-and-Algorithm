package Recursion_ll;

import javax.sound.midi.Soundbank;

public class wordSearch {
    public static boolean exist(char[][] board,String word){
        int n=board.length;
        int m=board[0].length;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(char[][] board,String word,int i,int j,int index){
        //base case
        if (index == word.length()){
            return true;
        }
        //out of bound and character match condition
        if(i<0 || j<0 || i>= board.length||j>= board[0].length||board[i][j]!=word.charAt(index)){
            return false;
        }

        char temp =board[i][j];
        board[i][j]='#';

        boolean found =dfs(board, word, i+1, j, index+1)||
                        dfs(board,word,i-1,j,index+1)||
                        dfs(board,word,i,j+1,index+1)||
                         dfs(board,word,i,j-1,index+1);


        board[i][j]=temp;
        return found;
    }

    public static void main(String[] args) {
        wordSearch sol=new wordSearch();
        char[][] board={
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        System.out.println(sol.exist(board, "ABCCED")); // ✅ true
        System.out.println(sol.exist(board, "SEE"));    // ✅ true
        System.out.println(sol.exist(board, "ABCB"));
    }
}
