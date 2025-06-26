// Last updated: 6/26/2025, 10:35:09 PM
class Solution {
    public void sortColors(int[] nums) {
    int low = 0;
    int high = nums.length - 1;
    int mid = 0;
    while (mid <= high) {
        if (nums[mid] == 0) { 
            swap(nums, mid, low);
            low++;
            mid++;
            } 
        else if (nums[mid] == 2) { 
            swap(nums, mid, high);
            high--;
            } 
        else { 
            mid++;
        }
    }
}
private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
}