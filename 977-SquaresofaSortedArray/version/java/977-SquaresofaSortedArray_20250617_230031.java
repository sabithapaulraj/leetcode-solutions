// Last updated: 6/17/2025, 11:00:31 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i]; // O(n)
        }
        Arrays.sort(nums); // Standard Dual-Pivot QuickSort Algorithm O(log n)
        return nums;
        
    }
}