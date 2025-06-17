# Last updated: 6/17/2025, 10:28:27 PM
class Solution:
    def romanToInt(self, s: str) -> int:
        roman_to_int = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        
        total = 0
        length = len(s)
        
        for i in range(length):
            current_value = roman_to_int[s[i]]

            if i < length - 1 and current_value < roman_to_int[s[i + 1]]:
                total -= current_value
            else:
                total += current_value
        
        return total