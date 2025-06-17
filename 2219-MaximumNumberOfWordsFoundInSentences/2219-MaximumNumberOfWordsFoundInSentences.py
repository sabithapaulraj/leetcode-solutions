# Last updated: 6/17/2025, 10:25:12 PM
class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        return max(s.count(' ') for s in sentences) + 1