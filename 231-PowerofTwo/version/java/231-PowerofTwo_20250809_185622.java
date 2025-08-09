// Last updated: 8/9/2025, 6:56:22 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
       if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        
        return isPowerOfTwo(n / 2);
        
    }
}