class Solution {
    int dp[];
    int fun(int n){
        if(n<=0) return 1;
        if(n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        int left=fun(n-1);
        int right=fun(n-2);
        dp[n]=left+right;
        return dp[n];
        
    }
    public int climbStairs(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
       return fun(n);
    }
}