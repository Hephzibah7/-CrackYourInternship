class Solution {
    int work(String[] strs, int m, int n, int i, int[][][] dp){
        if(m>=0 && n>=0 && i==strs.length) return 0;
        if(dp[i][m][n]!=-1) return dp[i][m][n];
         int countzero=0, countone=0;
         for(int j=0; j<strs[i].length(); j++){
            char ch=strs[i].charAt(j);
            if(ch=='1') countone++;
            else countzero++;
         }
         int left=0;
        if(m-countzero>=0 && n-countone>=0){
        left=1+work(strs, m-countzero ,n-countone, i+1,dp);
         }
        int right=work(strs, m, n, i+1, dp);
        return dp[i][m][n]=Math.max(left, right);
    }
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp=new int[strs.length][m+1][n+1];
        for(int i=0; i<strs.length; i++){
            for(int j=0; j<m+1; j++){
                for(int k=0; k<n+1; k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return work(strs, m, n, 0,dp);
    }
}