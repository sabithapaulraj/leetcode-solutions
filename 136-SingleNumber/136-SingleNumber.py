# Last updated: 6/17/2025, 10:27:56 PM
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        single_number = 0
        for num in nums:
            single_number^=num
        return single_number
        