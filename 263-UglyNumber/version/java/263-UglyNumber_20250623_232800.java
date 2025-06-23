// Last updated: 6/23/2025, 11:28:00 PM
class Solution {
    public boolean isUgly(int n) {
        // must be positive
        if (n <= 0) {
            return false;
        }
        // divide by 2 , 3 , 5
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        
        
        return n == 1;
        
    }
}