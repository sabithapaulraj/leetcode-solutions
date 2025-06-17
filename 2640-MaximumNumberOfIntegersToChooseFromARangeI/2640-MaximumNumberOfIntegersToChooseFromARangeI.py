# Last updated: 6/17/2025, 10:24:53 PM
# Sorting
class Solution:
    def maxCount(self, banned: List[int], n: int, maxSum: int) -> int:
        banned.sort()
        chosen_sum = 0
        count = 0
        banned_index = 0
        for i in range(1, n + 1):
            while banned_index < len(banned) and banned[banned_index] < i:
                banned_index += 1
            if banned_index < len(banned) and banned[banned_index] == i:
                continue
            if chosen_sum + i <= maxSum:
                chosen_sum += i
                count += 1
            elif chosen_sum + i > maxSum:
                break
        
        return count
        
        return count