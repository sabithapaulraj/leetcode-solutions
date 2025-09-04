// Last updated: 9/4/2025, 10:32:22 AM
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int count = 0;
        boolean positive = (dividend >= 0 && divisor >= 0) || (dividend < 0 && divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        while (a >= b) {
            long temp = b;
            int multiple = 1;

            // Double divisor until it exceeds a
            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            // Subtract largest chunk
            a -= temp;
            count += multiple;
        }
       if(positive){
        return count;
        }
       else{
        return -(count);
       }
    }
}