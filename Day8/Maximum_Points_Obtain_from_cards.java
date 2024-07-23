package Day8;

public class Maximum_Points_Obtain_from_cards {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0;
       
        int n=cardPoints.length;
        for(int i=0; i<k; i++){
         lsum += cardPoints[i];
        }
         int maxsum=lsum;
        int rindex=n-1;
        for(int i=k-1; i>=0; i--){
         lsum=lsum - cardPoints[i];
         rsum=rsum + cardPoints[rindex];
         rindex=rindex-1;
         maxsum=Math.max(maxsum, (lsum+rsum));
        }
        return maxsum;
     }
}
