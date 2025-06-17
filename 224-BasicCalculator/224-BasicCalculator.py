# Last updated: 6/17/2025, 10:27:31 PM
class Solution:
    def calculate(self, s: str) -> int:
        def helper(s, index):
            stack = []
            num = 0
            sign = 1

            while index < len(s):
                char = s[index]

                if char.isdigit():
                    num = num * 10 + int(char)
                elif char == '+':
                    stack.append(sign * num)
                    num = 0
                    sign = 1
                elif char == '-':
                    stack.append(sign * num)
                    num = 0
                    sign = -1
                elif char == '(':
                    num, index = helper(s, index + 1)
                elif char == ')':
                    stack.append(sign * num)
                    return sum(stack), index
                index += 1

            stack.append(sign * num)
            return sum(stack), index

        result, _ = helper(s, 0)
        return result
