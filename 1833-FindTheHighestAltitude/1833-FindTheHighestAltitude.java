// Last updated: 8/23/2025, 6:49:26 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int gainSum = 0;
        int highestAltitude = 0;
        for(int i = 0; i<n; i++){
            gainSum += gain[i];
            highestAltitude = Math.max(highestAltitude, gainSum);
        }
        return highestAltitude;
    }
}