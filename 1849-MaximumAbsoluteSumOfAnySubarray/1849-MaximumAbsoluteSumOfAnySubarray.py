# Last updated: 6/17/2025, 10:25:29 PM
from typing import List

class Solution:
    def maxAbsoluteSum(self, nums: List[int]) -> int:
        maxSum = 0  
        minSum = 0  
        current_max = 0
        current_min = 0
        
        for i in nums:
            current_max = max(current_max + i, i)
            current_min = min(current_min + i, i)
            maxSum = max(maxSum, current_max)
            minSum = min(minSum, current_min)
        
        return max(maxSum, abs(minSum))
