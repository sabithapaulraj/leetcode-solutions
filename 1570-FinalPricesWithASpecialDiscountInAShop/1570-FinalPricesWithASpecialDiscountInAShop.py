# Last updated: 6/17/2025, 10:25:42 PM
class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        result = prices[:]  
        stack = []  

        for i in range(len(prices)):
            while stack and prices[stack[-1]] >= prices[i]:
                index = stack.pop()  
                result[index] -= prices[i]  
            
            stack.append(i) 
        
        return result 
