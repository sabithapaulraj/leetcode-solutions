# Last updated: 6/17/2025, 10:27:15 PM
class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        i = 0
        for char in t:
            if i == len(s):
                break
            if s[i] == char:
                i += 1
        return i == len(s)
