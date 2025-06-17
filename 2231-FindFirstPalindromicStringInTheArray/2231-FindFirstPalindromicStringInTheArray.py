# Last updated: 6/17/2025, 10:25:11 PM
class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        for word in words:
            if word[::-1] == word:
                return word
        else:
            return ""