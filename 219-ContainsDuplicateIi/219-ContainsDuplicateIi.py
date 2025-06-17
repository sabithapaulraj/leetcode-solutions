# Last updated: 6/17/2025, 10:27:33 PM
class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        if k==0 or len(nums)==1:
            return False
        map = dict()

        for i in range(len(nums)):
            if nums[i] in map and abs(map[nums[i]]-i) <= k:
                    return True
            else:
                map[nums[i]] = i
        return False