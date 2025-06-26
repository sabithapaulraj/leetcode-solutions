// Last updated: 6/26/2025, 8:11:56 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        //Binary Search 
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}