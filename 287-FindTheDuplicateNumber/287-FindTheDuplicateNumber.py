# Last updated: 6/17/2025, 10:27:23 PM
class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        # Reference

        # Implementation using Floyd's Tortoise and Hare (Cycle Detection) algorithm

        # Phase 1: Finding the intersection point
        tortoise = nums[0]
        hare = nums[0]
        
        while True:
            tortoise = nums[tortoise]
            hare = nums[nums[hare]]
            if tortoise == hare:
                break
        
        # Phase 2: Finding the entrance to the cycle
        tortoise = nums[0]
        while tortoise != hare:
            tortoise = nums[tortoise]
            hare = nums[hare]
        
        return hare