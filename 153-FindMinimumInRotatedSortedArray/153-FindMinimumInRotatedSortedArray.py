# Last updated: 6/17/2025, 10:27:45 PM
class Solution:
    def findMin(self, nums: List[int]) -> int:
        left = 0
        right = len(nums)-1
        while left < right:
            mid = (left + right) // 2
            if nums[mid] > nums[right]:
                left = mid + 1
            else: 
                right = mid
        return nums[left]
        