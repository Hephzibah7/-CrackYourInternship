class Solution {
    public void work(int[][]image, int cellcolor, int[][] vis, int sr, int sc, int color){
        vis[sr][sc]=1;
        image[sr][sc]=color;
        int m=image.length;
        int n=image[0].length;
        int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        for(int[] a: dir){
            int pos1=sr+a[0];
            int pos2=sc+a[1];
            if(pos1>=0 && pos1<m && pos2>=0 && pos2<n && image[pos1][pos2]==cellcolor && vis[pos1][pos2]==0 ){
                image[pos1][pos2]=color;
                work(image, cellcolor, vis, pos1, pos2, color);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int[][] vis=new int[m][n];
        int cellcolor= image[sr][sc];
        work(image, cellcolor, vis, sr, sc, color);
        return image;

    }

}
