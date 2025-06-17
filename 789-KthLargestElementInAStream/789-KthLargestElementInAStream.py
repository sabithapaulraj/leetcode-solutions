# Last updated: 6/17/2025, 10:26:51 PM
class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        #minheap with K largest integers
        self.minheap , self.k = nums , k
        heapq.heapify(self.minheap)
        while len(self.minheap) > k:
            heapq.heappop(self.minheap)

    def add(self, val: int) -> int:
        heapq.heappush(self.minheap , val)
        if len(self.minheap) > self.k:
            heapq.heappop(self.minheap)
        return self.minheap[0]
        


# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)