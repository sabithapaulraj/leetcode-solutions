# Last updated: 6/17/2025, 10:24:22 PM
class Solution:
    def numberOfAlternatingGroups(self, colors: List[int], k: int) -> int:
        n = len(colors)
        size = n + k - 1
        ans=0
        alt=1
        prev = colors[0]
        for i in range(1, size):
            j = i % n
            alt = 1 if prev == colors[j] else alt + 1
            ans += (alt>=k)
            prev = colors[j]
        return ans

        