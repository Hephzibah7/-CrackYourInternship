package Day8;

public class Word_Search {
    boolean dfs(char[][] board, String word, int index, int row, int col, int[][] vis){
        if(index==word.length()-1) return true;
        int m=board.length;
        int n=board[0].length;
        vis[row][col]=1;
        int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        for(int[] a: dir){
                int x=row + a[0];
                int y= col+ a[1];
                if(x>=0 && x<m && y>=0 && y<n && vis[x][y]==0 && board[x][y]==word.charAt(index+1)){
                   if(dfs(board, word, index+1, x, y, vis)==true) return true;
                }
        }
        vis[row][col]=0;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        int vis[][]=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                vis[i][j]=0;
            }
        }
        boolean res=false;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==word.charAt(0)){
                if(dfs(board, word, 0, i, j, vis)==true) return true;
                }
            }
        }
        return false; 
    }
}
