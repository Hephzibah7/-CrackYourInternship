package Day3;

public class Coin_Change {
    int work(int i, int target, int[] coins, int[][] dp){
        if(i==0){
          if(target % coins[i] ==0) return target/coins[i];
          else return 10000000;
        }
        if(dp[i][target]!=-1) return dp[i][target];
        int notake = work(i-1, target, coins, dp);
        int take=10000000;
        if(coins[i]<=target){
            take=1+work(i, target-coins[i], coins, dp);
        }
        return dp[i][target]=Math.min(take, notake);
        }
        public int coinChange(int[] coins, int amount) {
            int n=coins.length;
            int[][] dp=new int[n][amount+1];
            for(int i=0; i<n; i++){
                for(int j=0; j<=amount; j++){
                    dp[i][j]=-1;
                }
            }
            if(work(n-1, amount, coins, dp)==10000000) return -1;
           return work(n-1, amount, coins, dp);
        }
}
