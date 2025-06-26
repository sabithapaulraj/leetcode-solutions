// Last updated: 6/26/2025, 11:47:58 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return (int) ((long) dividend / divisor);

    }
}