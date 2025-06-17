# Last updated: 6/17/2025, 10:24:43 PM
class Solution:
    def minimumIndex(self, nums: List[int]) -> int:
        sorted_nums = sorted(nums)
        n = len(nums)

        mid = sorted_nums[n // 2]
        count = sum(1 for num in nums if num == mid)
        
        if count * 2 <= n:
            return -1
        
        left_count = 0
        for i in range(n - 1):
            if nums[i] == mid:
                left_count += 1
                
            left_size = i + 1
            right_count = count - left_count
            right_size = n - left_size
            
            if left_count * 2 > left_size and right_count * 2 > right_size:
                return i
        
        return -1