# Last updated: 6/17/2025, 10:25:40 PM
class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        
        max1, max2 = 0, 0
        
        # Traversel of array to find the two largest elements
        for num in nums:
            if num > max1:
                max2 = max1
                max1 = num
            elif num > max2:
                max2 = num
        
        
        return (max1 - 1) * (max2 - 1)
