# Last updated: 6/17/2025, 10:28:13 PM
class Solution:
    def trap(self, height: List[int]) -> int:
        l=0
        r = len(height)-1
        lmax = 0
        rmax = 0
        ans = 0

        while l < r:
            lmax = max(lmax, height[l])
            rmax = max(rmax, height[r])

            if lmax < rmax:
                ans += lmax - height[l]
                l += 1
            else:
                ans += rmax - height[r]
                r -= 1
        
        return ans
        