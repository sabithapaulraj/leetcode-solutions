// Last updated: 6/25/2025, 10:13:29 PM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i=0; i<arr.length; i++){
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