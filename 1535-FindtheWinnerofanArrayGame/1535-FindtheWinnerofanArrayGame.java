// Last updated: 9/2/2025, 8:35:44 PM
class Solution {
    public int getWinner(int[] arr, int k) {
        int current = arr[0];
        int winStreak = 0;
        for(int i = 1; i < arr.length; i++){
            if(current > arr[i]){
                winStreak++;
            }
            else{
                current = arr[i];
                winStreak = 1;
            }
            if(winStreak == k) return current;
        }
        return current;
    }
}