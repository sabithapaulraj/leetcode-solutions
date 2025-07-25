# Last updated: 6/17/2025, 10:28:10 PM
class Solution:
    def myPow(self, x: float, n: int) -> float:
        if n == 0:
            return 1
        
        if n < 0:
            x = 1 / x 
            n = -n

        result = 1
        while n:
            if n % 2:
                result *= x
            x *= x  
            n //= 2
        
        return result
        
