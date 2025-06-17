# Last updated: 6/17/2025, 10:24:42 PM
class Solution:
    def countPairs(self, nums: List[int], target: int) -> int:
        # Sort the array
        nums.sort()
        n = len(nums)
        count = 0
        
        # Initialize two pointers
        left = 0
        right = n - 1
        
        while left < right:
            if nums[left] + nums[right] < target:
                # All pairs (left, i) where left < i <= right are valid
                count += right - left
                left += 1
            else:
                right -= 1
        
        return count