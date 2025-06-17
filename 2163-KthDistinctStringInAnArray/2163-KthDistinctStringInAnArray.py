# Last updated: 6/17/2025, 10:25:15 PM
class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        count = Counter(arr)

        for char, cnt in count.items():
            if cnt == 1:
                k -= 1
            if k == 0:
                return char

        return ""