// Last updated: 6/26/2025, 11:16:09 PM
class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0;
        
        int maxLength = 0;
        
        // Check each possible mountain starting position
        for (int i = 1; i < n - 1; i++) {
            // Check if current position can be a peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                
                // Expand left to find start of mountain
                int left = i;
                while (left > 0 && arr[left - 1] < arr[left]) {
                    left--;
                }
                
                // Expand right to find end of mountain
                int right = i;
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }
                
                // Calculate mountain length
                int currentLength = right - left + 1;
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        return maxLength;
    }
}