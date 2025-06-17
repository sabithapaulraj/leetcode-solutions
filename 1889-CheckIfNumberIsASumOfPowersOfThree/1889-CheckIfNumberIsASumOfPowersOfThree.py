# Last updated: 6/17/2025, 10:25:27 PM
class Solution:
    def checkPowersOfThree(self, n: int) -> bool:
        while n>0:
            if n%3 == 2:
                return False
            n//=3
        return True
        