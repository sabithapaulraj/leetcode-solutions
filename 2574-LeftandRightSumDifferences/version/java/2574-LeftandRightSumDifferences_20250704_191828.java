// Last updated: 7/4/2025, 7:18:28 PM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            for (int j = i + 1; j < n; j++) {
                rightSum += nums[j];
            }
            answer[i] = Math.abs(leftSum - rightSum);
        }
        
        return answer;
    }
}