# Last updated: 6/17/2025, 10:28:17 PM
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        q = 0
        sign = 1
        if divisor == 1:
            return dividend
        if ((dividend <0) and (divisor >=0)) or ((dividend>=0) and (divisor<0)):
            sign = -1
        dd = abs(dividend)
        dr = abs(divisor)
        for i in range(30, -1, -1): 
            if dd >= (dr << i):
                q += (1 << i)
                dd -= (dr << i)
        return sign * q
            
        