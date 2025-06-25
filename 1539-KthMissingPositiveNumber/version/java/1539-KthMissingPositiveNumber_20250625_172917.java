// Last updated: 6/25/2025, 5:29:17 PM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left=0;
        int right = (arr.length) - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            int missing = arr[mid]-(mid+1);
            if(missing < k){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return right + k + 1;
    }
}