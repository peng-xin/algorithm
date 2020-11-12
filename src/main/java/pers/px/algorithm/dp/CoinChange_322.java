package pers.px.algorithm.dp;


/*
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 *You may assume that you have an infinite number of each kind of coin.
 *Input: coins = [1,2,5], amount = 11
 *Output: 3
 *Explanation: 11 = 5 + 5 + 1
 *
 * */

import java.util.Arrays;

public class CoinChange_322 {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) {
            return -1;
        }

        if (amount == 0) {
            return 0;
        }

        int[] dp = new int[amount + 1];

        Arrays.fill(dp,amount+1);

        dp[0]=0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount]>amount?-1:dp[amount];
    }
}
