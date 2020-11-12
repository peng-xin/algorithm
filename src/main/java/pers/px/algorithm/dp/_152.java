package pers.px.algorithm.dp;

public class _152 {
    public int maxProduct(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int total=nums[0];
        int max=nums[0];
        int pre=nums[0];
        for (int i = 1; i < nums.length; i++) {
            max=Math.max(max,pre);
            pre=Math.max(pre*nums[i],nums[i]);
            total=total*nums[i];
        }
        return Math.max(total,max);
    }
}
