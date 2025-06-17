# Last updated: 6/17/2025, 10:27:05 PM
class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        l = 0
        r = len(nums) - 1 
        while l<=r:
            m = l + ((r - l) // 2)
            if ( (m-1<0) or nums[m - 1]!= nums[m]) and ((m+1 == len(nums)) or nums[m + 1] != nums[m]):
                return nums[m]
            if nums[m - 1] == nums[m]:
                left = m - 1
            else:
                left = m
            if left % 2:
                r = m - 1
            else:
                l = m + 1
        