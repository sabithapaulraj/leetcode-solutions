# Last updated: 6/17/2025, 10:25:31 PM
class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        count = {}
        for num in nums:
            if num in count:
                count[num] += 1
            else:
                count[num] = 1
        unique_sum = 0
        for num, freq in count.items():
            if freq == 1:
                unique_sum += num
                
        return unique_sum