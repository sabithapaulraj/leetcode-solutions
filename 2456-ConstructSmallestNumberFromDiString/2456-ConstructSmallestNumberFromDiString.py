# Last updated: 6/17/2025, 10:24:58 PM
# Greedy (Greedy Choice Property)
class Solution:
    def smallestNumber(self, pattern: str) -> str:
        n = len(pattern)
        stack = []
        result = []

        for i in range(n + 1):
            stack.append(str(i + 1))
            if i == n or pattern[i] == 'I':
                while stack:
                    result.append(stack.pop())

        return ''.join(result)