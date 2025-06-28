// Last updated: 6/28/2025, 12:10:18 PM
class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if(n < 3){
            return 0;
        }
        int maxSum = 0;
        for(int i = 1; i < n - 1; i++){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                int left = i;
                while(left > 0 && arr[left] > arr[left - 1]){
                    left--;
                }
                int right = i;
                while(right < n - 1 && arr[right] > arr[right + 1]){
                    right++;
                }
                int currentLength = right - left + 1;
                maxSum = Math.max(maxSum, currentLength);
            }
        }
        return maxSum;
    }            
}