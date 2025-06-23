// Last updated: 6/23/2025, 11:41:29 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
        
    }
}