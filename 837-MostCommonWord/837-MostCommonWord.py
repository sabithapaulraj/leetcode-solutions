# Last updated: 6/17/2025, 10:26:47 PM
class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        occurences = defaultdict(int)
        special = "!?',;."
        banned = set(banned)
        wordCount = 0
        res = None
        
        paragraph = paragraph.lower()
        for char in special:
            paragraph = paragraph.replace(char, ' ')

        for word in paragraph.split(" "):

            if len(word) > 0 and word not in banned:
                occurences[word] += 1
                
                if occurences[word] > wordCount:
                    wordCount = occurences[word]
                    res = word

        return res