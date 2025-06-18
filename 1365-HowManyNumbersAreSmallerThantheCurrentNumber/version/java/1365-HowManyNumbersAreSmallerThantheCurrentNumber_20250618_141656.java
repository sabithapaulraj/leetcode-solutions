// Last updated: 6/18/2025, 2:16:56 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Optimal Solution - Frequency Counting Method
        int[] count = new int[101];
        // calculate frequnecy of each number
        for(int num:nums){
            count[num]++;
        }
        // impelemnt prefix - sum logic
        for(int i = 1; i < 101; i++){
            count[i] += count[i-1];
        }
        // Output Array
        int[] result = new int[nums.length];
        for(int i = 0; i< nums.length;i++){
            if(nums[i] == 0){
                result[i] = 0;
            }
            else{
            result[i] = count[nums[i] - 1];
            }
        }
        return result;
    }
}