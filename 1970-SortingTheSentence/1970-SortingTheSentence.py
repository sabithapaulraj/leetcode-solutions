# Last updated: 6/17/2025, 10:25:22 PM
class Solution:
    def sortSentence(self, s: str) -> str:
        words = s.split()
        sorted_words = sorted(words, key=lambda word: int(word[-1]))
        return ' '.join(word[:-1] for word in sorted_words)