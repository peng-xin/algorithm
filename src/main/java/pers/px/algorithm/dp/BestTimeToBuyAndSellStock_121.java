package pers.px.algorithm.dp;

/*
 *
 *Say you have an array for which the ith element is the price of a given stock on day i.
 *
 *If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 *
 *Note that you cannot sell a stock before you buy one.
 *
 *Example 1:
 *
 *Input: [7,1,5,3,6,4]
 *Output: 5
 *Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *             Not 7-1 = 6, as selling price needs to be larger than buying price.
 *
 *来源：力扣（LeetCode）
 *链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock
 *著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */

public class BestTimeToBuyAndSellStock_121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int preMin = prices[0];
        int max=0;
        for (int i = 0; i < prices.length; i++) {
            max=Math.max(max,prices[i]-preMin);
            preMin=Math.min(preMin,prices[i]);
        }

        return max;
    }
}
