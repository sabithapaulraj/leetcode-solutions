# Last updated: 6/17/2025, 10:25:00 PM
class Solution:
    def countBadPairs(self, nums: List[int]) -> int:
        hashmap = {}
        pair = 0
        for i , num in enumerate(nums):
            key = num - i
            pair += hashmap.get(key, 0)
            hashmap[key] = hashmap.get(key, 0) + 1
        
        n = len(nums)
        return (n * (n - 1)) // 2 - pair
        