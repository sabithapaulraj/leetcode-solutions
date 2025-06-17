# Last updated: 6/17/2025, 10:24:36 PM
class Solution:
    def numberGame(self, nums: List[int]) -> List[int]:
        nums.sort()
        arr = []
        n = len(nums)
        
        # Simulate the game
        for i in range(n // 2):
            # Alice's move
            alice_pick = nums.pop(0)
            # Bob's move
            bob_pick = nums.pop(0)
            
            # Bob appends first, then Alice
            arr.append(bob_pick)
            arr.append(alice_pick)
        
        return arr
        