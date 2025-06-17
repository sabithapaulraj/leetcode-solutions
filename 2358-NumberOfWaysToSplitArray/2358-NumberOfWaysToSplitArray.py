# Last updated: 6/17/2025, 10:25:04 PM
class Solution:
    def waysToSplitArray(self, nums: List[int]) -> int:
        ans = 0
        total_sum = 0
        total= sum(nums)
        for i in range(len(nums)-1):
            total_sum+=nums[i]
            if total_sum>= (total - total_sum):
                ans+=1
        return ans