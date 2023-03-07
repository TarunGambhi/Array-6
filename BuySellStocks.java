//https://leetcode.com/problems/best-time-to-buy-and-sell-stock
//TC : O(n)
//SC : O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for(int i : prices){
            min = Math.min(min,i);
            max = Math.max(max,i-min);
        }
        return max;
    }
}
