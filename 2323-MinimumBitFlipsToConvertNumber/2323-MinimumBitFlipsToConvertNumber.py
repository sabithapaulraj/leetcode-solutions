# Last updated: 6/17/2025, 10:25:05 PM
class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        xor = start ^ goal
        return bin(xor).count("1")
        