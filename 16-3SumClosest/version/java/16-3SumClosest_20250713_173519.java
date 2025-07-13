// Last updated: 7/13/2025, 5:35:19 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];
        int minDiff = Math.abs(closestSum - target);
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int currentSum = nums[i] + nums[j] + nums[k];
                    int currentDiff = Math.abs(currentSum - target);
                    
                    if (currentDiff < minDiff) {
                        minDiff = currentDiff;
                        closestSum = currentSum;

                        if (currentDiff == 0) {
                            return closestSum;
                        }
                    }
                }
            }
        }
        
        return closestSum;
    }
}