//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv
//TC : nk 
//SC : O(k) 
// n- length of input array, k - number of max transactions
class Solution {
    public int maxProfit(int k, int[] prices) {
        int buy[] = new int[k];
        Arrays.fill(buy,Integer.MAX_VALUE);
        int sell[] = new int[k];
        buy[0] = prices[0];
        for(int i=1; i<prices.length; i++){
            for(int j=0;j<k;j++){
                if(j>0)
                    buy[j] = Math.min(buy[j], prices[i]-sell[j-1]);
                else{
                    buy[j] = Math.min(buy[j],prices[i]);
                }
                sell[j] = Math.max(sell[j], prices[i] - buy[j]);
            }
        }
        return sell[k-1];
    }
}
