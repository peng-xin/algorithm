package pers.px.algorithm.dp;


/*
 *Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 *
 *Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 *Output: 6
 *Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 *来源：力扣（LeetCode）
 *链接：https://leetcode-cn.com/problems/maximum-subarray
 *著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */
public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int pre = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            max = Math.max(max, pre);
        }

        return max;
    }
}
