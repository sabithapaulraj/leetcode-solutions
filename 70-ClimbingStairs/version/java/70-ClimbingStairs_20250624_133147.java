// Last updated: 6/24/2025, 1:31:47 PM
class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int prev1 = 1;
        int prev2 = 2;
        for(int i = 3; i<=n; i++){
            int current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;

        }
        return prev2;
        
    }
}