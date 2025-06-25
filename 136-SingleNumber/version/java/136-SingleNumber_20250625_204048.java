// Last updated: 6/25/2025, 8:40:48 PM
public class Solution {
    public int singleNumber(int[] nums) {
        // Most Optimal
        // Bit - Wise XOR
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
}
