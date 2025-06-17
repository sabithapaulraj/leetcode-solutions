# Last updated: 6/17/2025, 10:24:50 PM
class Solution:
    def repairCars(self, ranks: List[int], cars: int) -> int:
        def canFixInTime(t):
            totalCar = sum(int(sqrt(t // r)) for r in ranks)
            return totalCar >= cars
        
        left = 1
        right = max(ranks) * cars * cars
        
        while left < right:
            mid = (left + right) // 2
            if canFixInTime(mid):
                right = mid
            else:
                left = mid + 1
        
        return left