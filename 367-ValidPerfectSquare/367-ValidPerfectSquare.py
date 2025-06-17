# Last updated: 6/17/2025, 10:27:18 PM
class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        if num < 2:
            return True

        start = 1
        end = num // 2
        
        while start <= end:
            mid = (start + end) // 2
            square = mid * mid
            
            if square == num:
                return True
            elif square < num:
                start = mid + 1
            else:
                end = mid - 1
        
        return False