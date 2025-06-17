# Last updated: 6/17/2025, 10:24:20 PM
class Solution:
    def clearDigits(self, s: str) -> str:
        stack = []
        for char in s:
            if char.isdigit():
                if stack:
                    stack.pop()
            else:
                stack.append(char)
        return ''.join(stack)