// Last updated: 6/17/2025, 10:27:52 PM
public class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);  

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];  
            }
            i++;  
        }
        return nums[nums.length - 1]; 
    }
}