// Last updated: 6/26/2025, 8:36:49 PM
public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num: nums){
            result ^= num;
        }
        return result;
    }
}