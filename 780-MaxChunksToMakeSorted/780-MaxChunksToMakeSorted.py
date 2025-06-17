# Last updated: 6/17/2025, 10:26:54 PM
# Greedy Maximum Tracker Approach
class Solution:
    def maxChunksToSorted(self, arr: List[int]) -> int:
        if not arr:
            return 0
        count = 0
        max_val = 0
        for i in range(len(arr)):
            max_val = max(max_val, arr[i])
            if max_val == i:
                count+=1
        return count
        