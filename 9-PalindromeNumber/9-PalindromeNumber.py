# Last updated: 6/17/2025, 10:28:33 PM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        str_x = str(x)
        return str_x == str_x[::-1]