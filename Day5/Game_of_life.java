package Day5;

public class Game_of_life {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int lives=liveneighbors(board, m, n, i, j);
                if(board[i][j]==1 && (lives==2 || lives==3))
                board[i][j]=3;
                else
                if(board[i][j]==0 && lives==3)
                board[i][j]=2;

            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                board[i][j] >>=1;
            }
        }
    }
        public int liveneighbors(int[][] board, int m, int n, int x, int y){
            int lives=0;
            for(int i=Math.max(0, x-1); i<=Math.min(x+1, m-1); i++){
                for(int j=Math.max(0, y-1); j<=Math.min(y+1, n-1); j++){
                    lives += board[i][j] & 1;
                }
            }
            lives = lives - (board[x][y] & 1);
            return lives;
        }
}
