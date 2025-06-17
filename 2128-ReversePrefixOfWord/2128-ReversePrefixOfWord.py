# Last updated: 6/17/2025, 10:25:18 PM
class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        index = word.find(ch)
        if index == -1:
            return word
        prefix = word[:index+1]
        reversed_prefix = prefix[::-1]
        return reversed_prefix + word[index+1:]