# Last updated: 6/17/2025, 10:25:28 PM
class Solution:
    def minimumSize(self, nums: List[int], maxOperations: int) -> int:
        low, high = 1, max(nums)
        while low < high:
            mid = low + (high - low) // 2
            if sum((n - 1) // mid for n in nums) <= maxOperations:
                high = mid
            else:
                low = mid + 1
        return low