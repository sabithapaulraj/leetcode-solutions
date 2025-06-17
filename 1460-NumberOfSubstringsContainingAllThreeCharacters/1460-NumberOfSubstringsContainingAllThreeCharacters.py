# Last updated: 6/17/2025, 10:25:50 PM
class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        count = [0]*3
        left = 0
        res = 0
        for i , char in enumerate(s):
            count[ord(char) - ord('a')]+=1
            while all(count):
                res+=len(s)-i
                count[ord(s[left]) - ord('a')] -=1
                left+=1
        return res