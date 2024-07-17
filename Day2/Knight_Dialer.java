public class Knight_Dialer {
    int M=1000000007;
    int[][] arr= {{4,6},{6,8},{7,9},{4,8},{0,3,9},{},{0,1,7},{2,6},{1,3},{2,4}};
 
     int work(int n, int i, int[][] dp){
         if(n==0) return 1;
         if(dp[n][i]!=-1) return dp[n][i];
         int ans=0;
         for(int it: arr[i]){
             ans= (ans + work(n-1, it, dp)) % M;
         }
         return dp[n][i]=ans;
     }
     public int knightDialer(int n) {
         int result=0;
         int[][] dp=new int[n][10];
         for(int i=0; i<n; i++){
             for(int j=0; j<10; j++){
                 dp[i][j]=-1;
             }
         }
         for(int i=0; i<=9; i++){
             result = (result + work(n-1, i, dp)) % M;
         }
         return result;
     }
}
