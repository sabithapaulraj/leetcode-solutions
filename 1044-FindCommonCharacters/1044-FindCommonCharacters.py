# Last updated: 6/17/2025, 10:26:37 PM
from collections import Counter
from typing import List

class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        common_freq = Counter(words[0])
        for word in words[1:]:
            word_freq = Counter(word)
            for char in common_freq.keys():
                common_freq[char] = min(common_freq[char], word_freq[char])
        result = []
        for char, count in common_freq.items():
            result.extend([char] * count)
            
        return result