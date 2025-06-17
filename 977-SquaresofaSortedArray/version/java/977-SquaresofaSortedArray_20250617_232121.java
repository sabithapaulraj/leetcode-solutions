// Last updated: 6/17/2025, 11:21:21 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        // Two - Pointer Approach
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n-1;
        int position = n - 1;

        while(left <= right){
            int squareofLeft = nums[left] * nums[left];
            int squareofRight = nums[right] * nums[right];

            if(squareofLeft > squareofRight){
                result[position] = squareofLeft;
                left++;
            }
            else{
                result[position] = squareofRight;
                right--;
            }
            position--;
        }
        return result;
        
    }
}