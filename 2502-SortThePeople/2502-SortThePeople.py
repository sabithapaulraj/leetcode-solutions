# Last updated: 6/17/2025, 10:24:57 PM
class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        sorted_people = sorted(zip(heights, names), reverse=True)
        return [name for _, name in sorted_people]