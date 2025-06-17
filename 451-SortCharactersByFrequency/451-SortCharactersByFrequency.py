# Last updated: 6/17/2025, 10:27:09 PM
class Solution:
    def frequencySort(self, s: str) -> str:
        freq = {}
        for char in s:
            if char in freq:
                freq[char] += 1
            else:
                freq[char] = 1
        sorted_chars = sorted(freq, key=freq.get, reverse=True)
        result = ''
        for char in sorted_chars:
            result += char * freq[char]
        
        return result