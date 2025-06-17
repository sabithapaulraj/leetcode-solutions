# Last updated: 6/17/2025, 10:28:00 PM
class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        stack = []  
        max_area = 0
        heights.append(0)  
        i = 0

        while i < len(heights):
            if not stack or heights[i] >= heights[stack[-1]]:
                stack.append(i)
                i += 1
            else:
                top = stack.pop()
                height = heights[top]
                width = i if not stack else i - stack[-1] - 1
                max_area = max(max_area, height * width)

        return max_area


        