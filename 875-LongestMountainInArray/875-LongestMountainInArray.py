# Last updated: 6/17/2025, 10:26:45 PM
class Solution:
    def longestMountain(self, arr: List[int]) -> int:
        n = len(arr)
        if n < 3:
            return 0
        # dp
        up = [0] * n
        down = [0] * n
        
        for i in range(1, n):
            if arr[i] > arr[i - 1]:
                up[i] = up[i - 1] + 1
        
        for i in range(n - 2, -1, -1):
            if arr[i] > arr[i + 1]:
                down[i] = down[i + 1] + 1
        
        max_length = 0
        for i in range(1, n - 1):
            if up[i] > 0 and down[i] > 0:
                max_length = max(max_length, up[i] + down[i] + 1)
        
        return max_length