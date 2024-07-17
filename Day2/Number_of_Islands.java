import java.util.*;
class Pair{
    int first,second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    void bfs(int m, int n, int vis[][], char grid[][]){
        vis[m][n]=1;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(m,n));

        int rows=grid.length;
        int cols=grid[0].length;
        int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            for(int[] d :dir){
                
                    int nrow=row+d[0];
                    int ncol=col+d[1];
                    if(nrow>=0 && nrow<rows && ncol>=0 && ncol<cols && vis[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
                        vis[nrow][ncol]=1;
                        q.add(new Pair(nrow,ncol));
                   
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n];
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    count++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return count;
    }
}
