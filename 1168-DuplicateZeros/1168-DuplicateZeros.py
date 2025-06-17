# Last updated: 6/17/2025, 10:26:05 PM
class Solution:
    def duplicateZeros(self, arr: List[int]) -> None:
        n = len(arr)
        zeros = arr.count(0)
        i = n - 1
        j = n + zeros - 1

        while i >= 0:
            if j < n:
                arr[j] = arr[i]
            if arr[i] == 0:
                j -= 1
                if j < n:
                    arr[j] = 0
            j -= 1
            i -= 1