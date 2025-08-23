// Last updated: 8/23/2025, 6:49:43 PM
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}