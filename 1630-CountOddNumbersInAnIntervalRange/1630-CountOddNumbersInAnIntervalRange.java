// Last updated: 8/23/2025, 6:49:42 PM
class Solution {
    public int countOdds(int low, int high) {
        int totalNumbers = high - low + 1;
        int oddNumbers = (totalNumbers + (low % 2)) / 2;
        return oddNumbers;
    }
}