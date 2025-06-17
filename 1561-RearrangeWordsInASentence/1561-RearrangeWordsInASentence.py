# Last updated: 6/17/2025, 10:25:43 PM
class Solution:
    def arrangeWords(self, text: str) -> str:
        text = text[0].lower() + text[1:]
        words = text.split()
        sorted_words = sorted(words, key=len)
        rearranged_text = ' '.join(sorted_words)
        rearranged_text = rearranged_text[0].upper() + rearranged_text[1:]

        return rearranged_text