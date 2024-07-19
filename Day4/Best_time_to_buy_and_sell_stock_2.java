package Day4;

public class Best_time_to_buy_and_sell_stock_2 {
    public int maxProfit(int[] prices) {
        int val=0;
        int profit=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                val=prices[i]-prices[i-1];
                profit=profit+val;
            }
        }
        return profit;
    } 
}
