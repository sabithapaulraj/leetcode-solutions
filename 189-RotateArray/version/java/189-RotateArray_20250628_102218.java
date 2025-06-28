// Last updated: 6/28/2025, 10:22:18 AM
class Solution{
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // Reverse Entire Array
        reverse(nums, 0 , n - 1);
        // Reverse first 3 elements
        reverse(nums, 0, k - 1);
        // Reverse last 4 elements
        reverse(nums, k, n - 1);
    }
        // Reverse Function
        private void reverse(int[] nums, int start, int end){
            while(start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    
}