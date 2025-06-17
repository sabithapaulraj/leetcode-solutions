# Last updated: 6/17/2025, 10:25:19 PM
class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        count = {}
        for char in s:
            if char in count:
                count[char] += 1
            else:
                count[char] = 1
        first = list(count.values())[0]

        for c in count.values():
            if c!= first:
                return False     
        return True