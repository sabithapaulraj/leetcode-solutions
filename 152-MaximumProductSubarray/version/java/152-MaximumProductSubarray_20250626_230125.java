// Last updated: 6/26/2025, 11:01:25 PM
class Solution{
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // If current number is negative, swap max and min
            if (nums[i] < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            
            // Update current max and min
            currentMax = Math.max(nums[i], currentMax * nums[i]);
            currentMin = Math.min(nums[i], currentMin * nums[i]);
            
            // Update result
            result = Math.max(result, currentMax);
        }
        
        return result;
    }
}
