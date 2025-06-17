# Last updated: 6/17/2025, 10:24:27 PM
class Solution:
    def queryResults(self, limit: int, queries: List[List[int]]) -> List[int]:
        dis = 0
        freq, colours = {}, {}
        res = []
        for x, y in queries:
            freq[y] = freq.get(y,0) + 1
            if freq[y] == 1:
                dis += 1
            if x in colours:
                freq[colours[x]] -=1
                if freq[colours[x]] == 0:
                    dis -= 1
            colours[x] = y
            res.append(dis)
        return res
        
        