// Last updated: 6/17/2025, 10:24:49 PM
class Solution {
    
    private boolean canSteal(int[] nums, int k, int capability) {
        int steal = 0;
        int i = 0;
        int n = nums.length;

        while (i < n && steal < k) {
            if (nums[i] <= capability) {
                steal++;
                i += 2;
            } else {
                i++;
            }
        }

        return steal >= k;
    }

    public int minCapability(int[] nums, int k) {
        int n = nums.length;
        int minH = Integer.MAX_VALUE;
        int maxH = Integer.MIN_VALUE;

        for (int val : nums) {
            minH = Math.min(minH, val);
            maxH = Math.max(maxH, val);
        }

        while (minH < maxH) {
            int mid = (minH + maxH) / 2;

            if (canSteal(nums, k, mid)) {
                maxH = mid;
            } else {
                minH = mid + 1;
            }
        }

        return minH;
    }
}
