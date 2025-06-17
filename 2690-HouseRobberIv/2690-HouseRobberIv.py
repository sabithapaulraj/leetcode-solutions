# Last updated: 6/17/2025, 10:24:54 PM
class Solution:
    def minCapability(self, nums: List[int], k: int) -> int:
        def canRob(mid):
            count, i = 0, 0
            while i < len(nums):
                if nums[i] <= mid:
                    count += 1
                    i += 2
                else:
                    i += 1
            return count >= k

        left, right = min(nums), max(nums)
        
        while left < right:
            mid = (left + right) // 2
            if canRob(mid):
                right = mid
            else:
                left = mid + 1
        
        return left