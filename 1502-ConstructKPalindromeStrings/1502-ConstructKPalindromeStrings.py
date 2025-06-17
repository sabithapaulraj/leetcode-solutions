# Last updated: 6/17/2025, 10:25:46 PM
class Solution:
    def canConstruct(self, s: str, k: int) -> bool:
        n = len(s)
        if n < k:
            return False
        freq = Counter(s)
        odd_count = sum(1 for count in freq.values() if count % 2!=0)
        return odd_count <=k
        