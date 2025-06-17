// Last updated: 6/17/2025, 11:26:19 PM
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}