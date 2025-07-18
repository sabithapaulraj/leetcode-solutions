# Last updated: 6/17/2025, 10:27:25 PM
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        last = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[last] = nums[i]
                last += 1
        for i in range(last, len(nums)):
            nums[i] = 0