# Last updated: 6/17/2025, 10:25:21 PM
class Solution:
    def removeOccurrences(self, s: str, part: str) -> str:
        stack = []
        part_len = len(part)
        
        for char in s:
            stack.append(char)
            if ''.join(stack[-part_len:]) == part:
                del stack[-part_len:]
        
        return ''.join(stack)