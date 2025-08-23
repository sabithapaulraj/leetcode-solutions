// Last updated: 8/23/2025, 6:49:40 PM
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