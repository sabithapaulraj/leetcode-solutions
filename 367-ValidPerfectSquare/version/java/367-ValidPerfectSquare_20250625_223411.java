// Last updated: 6/25/2025, 10:34:11 PM
class Solution {
    public boolean isPerfectSquare(int num) {
    long i = 1;  // Using long to avoid overflow
    while (i * i <= num) {
        if (i * i == num) {
            return true;
        }
        i++;
    }
    return false;
}
}