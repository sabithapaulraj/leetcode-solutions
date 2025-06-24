// Last updated: 6/24/2025, 11:50:08 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = (nums.length) - 1;
        int resultIndex = (nums.length) - 1;
        while(left <= right){
            if(nums[right]*nums[right] > nums[left]*nums[left]){
                result[resultIndex] = nums[right]*nums[right];
                right--;
            }
            else{
                result[resultIndex] = nums[left]*nums[left];
                left++;
            }
            resultIndex--;
        }
        return result;
        
    }
}