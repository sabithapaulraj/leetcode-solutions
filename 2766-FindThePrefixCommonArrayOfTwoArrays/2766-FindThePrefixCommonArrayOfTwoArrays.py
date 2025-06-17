# Last updated: 6/17/2025, 10:24:47 PM
class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        n = len(A)
        prefix_common = [0] * n
        seen_A = set()
        seen_B = set()
        
        common_count = 0
        
        for i in range(n):
            seen_A.add(A[i])
            seen_B.add(B[i])
            
            if A[i] in seen_B:
                common_count += 1
            if B[i] in seen_A and A[i] != B[i]:
                common_count += 1
            
            prefix_common[i] = common_count
        
        return prefix_common