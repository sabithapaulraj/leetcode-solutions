// Last updated: 6/23/2025, 11:30:15 PM
class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
        
    }
}