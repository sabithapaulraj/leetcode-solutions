# Last updated: 6/17/2025, 10:27:19 PM
class Solution:
    def countNumbersWithUniqueDigits(self, n: int) -> int:
        if n == 0:
            return 1
        if n == 1:
            return 10  
        ans = 10 
        unique_digits = 9 
        available_digits = 9

        for i in range(2, n + 1):  
            unique_digits *= available_digits  
            ans += unique_digits 
            available_digits -= 1  
        
        return ans

        