# Last updated: 6/17/2025, 10:25:35 PM
class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        str1 = ''.join(word1)
        str2 = ''.join(word2)
        return str1 == str2