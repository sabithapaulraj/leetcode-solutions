# Last updated: 6/17/2025, 10:25:06 PM
class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        count = 0
        for word in words:
            if word.startswith(pref):
                count+=1
        return count