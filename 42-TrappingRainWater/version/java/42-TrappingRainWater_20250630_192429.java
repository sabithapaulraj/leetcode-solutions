// Last updated: 6/30/2025, 7:24:29 PM
class Solution {
    public int trap(int[] height) {
        int left = 0;                     // Start from left end
        int right = height.length - 1;   // Start from right end
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                // If current height is less than max seen so far, it can trap water
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // Update max on the left
                } else {
                    water += leftMax - height[left]; // Water trapped = max - current
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // Update max on the right
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }
}
