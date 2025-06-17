# Last updated: 6/17/2025, 10:25:01 PM
class Solution:
    def repeatedCharacter(self, s: str) -> str:
        l=[]
        for char in s:
            if char in l:
                return char
            else:
                l.append(char)

        