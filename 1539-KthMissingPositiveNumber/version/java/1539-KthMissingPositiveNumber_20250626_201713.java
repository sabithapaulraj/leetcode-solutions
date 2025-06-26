// Last updated: 6/26/2025, 8:17:13 PM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i = 0; i<arr.length; i++){
            if(arr[i] <= k){
                k++;
            }
            else{
                break;
            }
        }
        return k;

    }
}