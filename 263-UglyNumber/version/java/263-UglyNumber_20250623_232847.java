// Last updated: 6/23/2025, 11:28:47 PM
class Solution {
    public boolean isUgly(int n) {
         if (n <= 0) return false;
        
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        
        return n == 1;
        
    }
}