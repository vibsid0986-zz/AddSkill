class Solution {
    public int maxProfit(int[] prices) {
        int minval = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0;i<prices.length;i++){
            if(prices[i]<minval){
                minval=prices[i];
            }
            if(profit<(prices[i]-minval)){
                profit=prices[i]-minval;
            }
        }
        return profit;
    }
}
