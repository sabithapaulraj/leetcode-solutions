# Last updated: 6/17/2025, 10:25:13 PM
from collections import Counter
from typing import List

class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        freq = Counter(nums)
        for count in freq.values():
            if count % 2 != 0:
                return False
        
        return True