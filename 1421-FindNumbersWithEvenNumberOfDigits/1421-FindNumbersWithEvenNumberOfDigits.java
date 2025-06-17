// Last updated: 6/17/2025, 10:25:56 PM
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int numDigits = String.valueOf(nums[i]).length();
            if (numDigits % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
