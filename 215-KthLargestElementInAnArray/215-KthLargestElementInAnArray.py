# Last updated: 6/17/2025, 10:27:35 PM
class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        nums.sort()
        return nums[-k]
        