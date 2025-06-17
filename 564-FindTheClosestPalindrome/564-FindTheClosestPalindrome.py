# Last updated: 6/17/2025, 10:27:04 PM
class Solution:
    def nearestPalindromic(self, n: str) -> str:
        N = len(n)

        # Edge case: If the number is a single digit, return n-1
        if N == 1:
            return str(int(n) - 1)

        original = int(n)
        less_digits = 10 ** (N - 1) - 1  # Smallest palindrome with fewer digits
        more_digits = 10 ** N + 1        # Smallest palindrome with more digits

        # First half of the number (for generating palindromes)
        half_val = int(n[:(N + 1) // 2])

        # Generate possible palindrome candidates
        same = self.build_palindrome(half_val, N % 2 == 0)
        smaller = self.build_palindrome(half_val - 1, N % 2 == 0)
        bigger = self.build_palindrome(half_val + 1, N % 2 == 0)

        candidates = [less_digits, more_digits, smaller, same, bigger]

        # Find the closest palindrome (if tie, return the smaller one)
        closest = min(candidates, key=lambda x: (abs(x - original), x) if x != original else (float('inf'), x))

        return str(closest)

    def build_palindrome(self, half: int, is_even: bool) -> int:
        half_str = str(half)
        if is_even:
            return int(half_str + half_str[::-1])
        else:
            return int(half_str + half_str[:-1][::-1])
