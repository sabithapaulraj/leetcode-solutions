// Last updated: 6/26/2025, 11:24:16 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;  // Only "0" in range [0, 1)
        
        int result = 10;  // All 1-digit numbers (0-9) have unique digits
        
        // Calculate for 2-digit, 3-digit, ... n-digit numbers
        int availableDigits = 9;  // First digit: 1-9 (can't start with 0)
        int uniqueDigits = 9;     // Remaining digits: 0-9 except first digit
        
        for (int i = 2; i <= n; i++) {
            uniqueDigits *= availableDigits;  // Choose next digit
            result += uniqueDigits;           // Add to total count
            availableDigits--;                // One less digit available
        }
        
        return result;
    }
}