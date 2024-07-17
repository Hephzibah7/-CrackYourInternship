public class Maximize_the_cut_segments {

        int work(int n, int x, int y, int z, int[] dp){
            if(n==0) return 0;
            if(n<0) return -10000000;
            if(dp[n]!=-1) return dp[n];
            int left=1+work(n-x, x, y, z, dp);
            int middle=1+work(n-y, x, y, z, dp);
            int right=1+work(n-z, x, y, z, dp);
            return dp[n]=Math.max(middle, Math.max(left, right));
            
        }
        //Function to find the maximum number of cuts.
        public int maximizeCuts(int n, int x, int y, int z)
        {
            int[] dp=new int[n+1];
            for(int i=0; i<=n; i++){
                dp[i]=-1;
            }
            if(work(n, x, y, z, dp)<0) return 0;
           return work(n, x, y, z, dp);
        }
}