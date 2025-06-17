# Last updated: 6/17/2025, 10:29:12 PM
# dfs approach using backtracking with memoization
class Solution:
    def numTilePossibilities(self, tiles: str) -> int:
        count = tuple(sorted(Counter(tiles).values()))
        
        cache = {}
        
        def dfs(count):
            if count in cache:
                return cache[count]
            s = 0
            for i in range(len(count)):
                if count[i] == 0:
                    continue
                new = list(count)
                new[i] -= 1
                s += 1 + dfs(tuple(new))
            cache[count] = s
            return s
        
        return dfs(count)