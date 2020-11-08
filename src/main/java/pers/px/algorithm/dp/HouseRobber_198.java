package pers.px.algorithm.dp;


/*
* You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
*Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
*Input: nums = [1,2,3,1]
*Output: 4
*Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
*             Total amount you can rob = 1 + 3 = 4.
*来源：力扣（LeetCode）
*链接：https://leetcode-cn.com/problems/house-robber
*著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */

public class HouseRobber_198 {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int houseSize=nums.length;
        if(houseSize==1){
            return nums[0];
        }
        int[] dp=new int[houseSize];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i=2;i<houseSize;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return Math.max(dp[houseSize-2],dp[houseSize-1]);
    }
}
