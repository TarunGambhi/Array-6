//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii
//TC : O(n)
//SC : O(1)
class Solution {
    public int maxProfit(int[] prices) {
        
        int result =0;
        int min = prices[0];
        for(int i : prices){
            min = Math.min(min,i);
            if(i - min > 0){
                result += i-min;
                min=i;
            }
        }
        return result;
    }
}
