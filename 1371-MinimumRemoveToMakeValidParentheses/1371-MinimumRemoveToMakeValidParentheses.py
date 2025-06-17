# Last updated: 6/17/2025, 10:25:54 PM
class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        stack = []
        invalid_indices = set()

        for i in range(len(s)):
            if s[i] == '(':
                stack.append(i)
            elif s[i] == ')':
                if stack:
                    stack.pop()
                else:
                    invalid_indices.add(i)

        invalid_indices.update(stack)

        result = []
        for i in range(len(s)):
            if i not in invalid_indices:
                result.append(s[i])

        return ''.join(result)
