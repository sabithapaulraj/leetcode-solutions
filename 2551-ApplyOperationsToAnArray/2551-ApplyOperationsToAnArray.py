# Last updated: 6/17/2025, 10:24:55 PM
class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        res = []
        n = len(nums)
        for i in range(n - 1):
            if nums[i] == nums[i + 1]:
                nums[i] *= 2
                nums[i + 1] = 0
        for i in nums:
            if i!=0:
                res.append(i)
        while len(res) < n:
            res.append(0)
        return res
        