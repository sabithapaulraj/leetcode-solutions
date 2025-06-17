# Last updated: 6/17/2025, 10:25:09 PM
class Solution:
    def addSpaces(self, s: str, spaces: List[int]) -> str:
        result = []

        s_index = 0
        spaces_index = 0

        while s_index < len(s):
            if spaces_index < len(spaces) and s_index == spaces[spaces_index]:
                result.append(" ")
                spaces_index += 1
            result.append(s[s_index])
            s_index += 1
        return "".join(result)