# Last updated: 6/17/2025, 10:24:39 PM
#Greedy
class Solution:
    def minChanges(self, s: str) -> int:
        result = 0
        for i in range(0, len(s), 2):
            if s[i]!= s[i+1]:
                result += 1
        return result
        