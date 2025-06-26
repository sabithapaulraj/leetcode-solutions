// Last updated: 6/26/2025, 11:46:23 PM
class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        long N=n;
        if(n<0){
            N=-N;
            x=1/x;
        }
        if(N%2==0) return myPow(x*x, (int)(N/2)); //if n is even.
        return x * myPow(x, (int)(N-1)); //if n is odd
    }
}