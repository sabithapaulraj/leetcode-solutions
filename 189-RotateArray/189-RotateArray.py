# Last updated: 6/17/2025, 10:27:41 PM
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        k %= len(nums) 
        nums[:] = nums[-k:] + nums[:-k] 
