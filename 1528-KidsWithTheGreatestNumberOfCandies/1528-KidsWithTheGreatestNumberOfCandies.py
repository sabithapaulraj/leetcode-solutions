# Last updated: 6/17/2025, 10:25:45 PM
class Solution:
    def kidsWithCandies(self, candies, extraCandies):
        max_candy = max(candies)  
        result = []  
        
        for candy in candies:
            if candy + extraCandies >= max_candy:  
                result.append(True)
            else:
                result.append(False)
        
        return result
