// Last updated: 6/30/2025, 7:03:46 PM
class Solution {
    public int findMin(int[] nums) {
        int minimum = nums[0];
        for(int num : nums){
            minimum = Math.min(num, minimum);
        }
        return minimum;
    }
}