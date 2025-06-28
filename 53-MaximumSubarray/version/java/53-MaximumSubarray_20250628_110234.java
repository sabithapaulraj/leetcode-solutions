// Last updated: 6/28/2025, 11:02:34 AM
class Solution{
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int maxSum = nums[0];
        int currentSum = nums[0];
        for(int i = 1; i< nums.length; i++){ //Loop Should Start from 1
            if(currentSum < 0){
                currentSum = nums[i];
            }
            else{
                currentSum += nums[i];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}