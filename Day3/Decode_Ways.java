package Day3;

import java.util.Arrays;

public class Decode_Ways {
   int work(int index, String s, int[] dp){
        if(index==s.length()) return 1;
        if(s.charAt(index)=='0') return 0;
        if(dp[index]!=-1) return dp[index];
        int left=work(index+1, s, dp);
        int right=0;
        if(index+1<s.length()){
            if(s.charAt(index)=='1' || (s.charAt(index)=='2' && s.charAt(index+1)<='6'))
             right=work(index+2, s, dp);
        }
        return dp[index]=left+right;
    }
    public int numDecodings(String s) {
        int dp[]=new int[s.length()+1];
        Arrays.fill(dp, -1);
        return work(0, s, dp);
    } 
}
