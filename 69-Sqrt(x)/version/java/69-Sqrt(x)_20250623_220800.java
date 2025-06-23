// Last updated: 6/23/2025, 10:08:00 PM
class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        
        long r = x;  
        
        // Newton's iteration: r = (r + x/r) / 2
        while (r * r > x) {
            r = (r + x / r) / 2;
        }
        
        return (int) r;
        
    }
}