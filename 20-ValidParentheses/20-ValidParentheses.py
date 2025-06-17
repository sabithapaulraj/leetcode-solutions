# Last updated: 6/17/2025, 10:28:25 PM
class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        parantheses = {")": "(", "}": "{", "]": "["}
        
        for char in s:
            if char in parantheses:
                if stack:
                    top_element = stack.pop()
                else:
                    top_element = '#'
                
                if parantheses[char] != top_element:
                    return False
            else:
                stack.append(char)
        
        return not stack