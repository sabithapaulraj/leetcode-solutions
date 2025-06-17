# Last updated: 6/17/2025, 10:26:00 PM
class Solution:
    def maximumCandies(self, candies: List[int], k: int) -> int:
        def candy(candy, k):
            for i in candies:
                k -= i // candy
                if k <= 0:
                    return True
            return False
        total = sum(candies)
        if total<k:
            return 0
        left = 1
        right = total // k

        # Binary Search Implementation :)
        while left < right:
            mid = (left + right +1) // 2
            if candy(mid, k):
                left = mid
            else:
                right = mid - 1
        return left
        