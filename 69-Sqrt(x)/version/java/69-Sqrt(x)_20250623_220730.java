// Last updated: 6/23/2025, 10:07:30 PM
class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        
        int left = 1, right = x;
        int result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            
            if (mid <= x / mid) {
                result = mid;  
                left = mid + 1;  
            } else {
                right = mid - 1;  
            }
        }
        
        return result;
        
    }
}