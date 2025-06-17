# Last updated: 6/17/2025, 10:27:13 PM
class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        first = second = third = None
        
        for num in nums:
            if num == first or num == second or num == third:
                continue
            if first is None or num > first:
                third = second
                second = first
                first = num
            elif second is None or num > second:
                third = second
                second = num
            elif third is None or num > third:
                third = num
        
        return first if third is None else third