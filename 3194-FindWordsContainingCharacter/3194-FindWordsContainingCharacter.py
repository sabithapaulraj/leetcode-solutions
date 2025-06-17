# Last updated: 6/17/2025, 10:24:37 PM
class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        l=[] 
        for i in range(len(words)):
            if x in words[i]:
                l.append(i)
        return l