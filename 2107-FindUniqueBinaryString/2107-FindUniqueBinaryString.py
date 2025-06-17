# Last updated: 6/17/2025, 10:25:16 PM
class Solution:
    def findDifferentBinaryString(self, nums: List[str]) -> str:
        result = []
        for i in range(len(nums)):
            if (nums[i][i]=='0'):
                result.append('1')
            else:
                result.append('0')
        return ''.join(result)
        