# Last updated: 6/17/2025, 10:26:49 PM
class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        if len(s) != len(goal):
            return False
        return goal in (s + s)
        