# Last updated: 6/17/2025, 10:26:50 PM
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left, right = 0, len(nums) - 1
        
        # Binary Search Implementation
        while left <= right:
            mid = left + (right - left) // 2 
            
            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                left = mid + 1
            else:
                right = mid - 1
        
        return -1
