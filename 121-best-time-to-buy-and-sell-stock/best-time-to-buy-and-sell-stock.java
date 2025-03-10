class Solution {
    public int maxProfit(int[] prices) {
        int bp=prices[0],profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(bp>prices[i])
            bp=prices[i];
            profit=Math.max(profit,prices[i]-bp);
        }
        return profit;
        
    }
}