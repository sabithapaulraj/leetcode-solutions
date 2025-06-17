# Last updated: 6/17/2025, 10:25:25 PM
class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        unique_chars = set()
        for char in sentence:
            unique_chars.add(char)
        return len(unique_chars) == 26
        