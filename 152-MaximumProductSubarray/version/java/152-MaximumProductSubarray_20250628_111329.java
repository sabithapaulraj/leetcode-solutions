// Last updated: 6/28/2025, 11:13:29 AM
class Solution{
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < 0){
                // Swap Current Max and Current Min
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            currentMax = Math.max(nums[i], currentMax * nums[i]);
            currentMin = Math.min(nums[i], currentMin * nums[i]);
            result = Math.max(result , currentMax);
        }
        return result;
    }
}
