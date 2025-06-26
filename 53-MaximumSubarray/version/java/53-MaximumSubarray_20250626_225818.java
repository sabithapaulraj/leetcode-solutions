// Last updated: 6/26/2025, 10:58:18 PM
class Solution{
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // If current sum becomes negative, reset to current element
            if (currentSum < 0) {
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
            }
            
            // Update maximum
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}