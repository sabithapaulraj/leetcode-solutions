# Last updated: 6/17/2025, 10:27:42 PM
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums.sort()
        majority_element = nums[len(nums)//2]
        if nums.count(majority_element) > len(nums)//2:
            return majority_element
        else:
            return -1
