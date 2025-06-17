# Last updated: 6/17/2025, 10:25:39 PM
class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        for i in range(len(arr)):
            missing = arr[i] - (i + 1)
            if missing >= k:
                return k + i
        return k + len(arr)

        