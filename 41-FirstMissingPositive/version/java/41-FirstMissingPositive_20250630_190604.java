// Last updated: 6/30/2025, 7:06:04 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);  
        int smallest = 1;
        for (int num : nums) {
            if (num == smallest) {
                smallest++;
            }
        }
        return smallest;
        
    }
}