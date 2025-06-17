// Last updated: 6/17/2025, 10:24:29 PM
class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++){
            if (nums[i]==0){
                count++;
                if (i+2 >= n){
                    return -1;
                }
                nums[i] ^= 1;
                nums[i+1] ^= 1;
                nums[i+2] ^= 1;
            }
        }
        return count;
    }
}