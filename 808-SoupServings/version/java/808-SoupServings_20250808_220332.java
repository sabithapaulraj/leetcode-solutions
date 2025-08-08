// Last updated: 8/8/2025, 10:03:32 PM
class Solution {
    private Double[][] memo;
    public double soupServings(int n) {
        if (n >= 4800) {
            return 1.0;
        }
        int units = (n + 24) / 25; 
        memo = new Double[units + 1][units + 1];
        return solve(units, units);
    }
    
    private double solve(int a, int b) {
        if (a <= 0 && b <= 0) {
            return 0.5; 
        }
        if (a <= 0) {
            return 1.0; 
        }
        if (b <= 0) {
            return 0.0; 
        }

        if (memo[a][b] != null) {
            return memo[a][b];
        }

        double result = 0.25 * (
            solve(Math.max(0, a - 4), b) +           
            solve(Math.max(0, a - 3), Math.max(0, b - 1)) + 
            solve(Math.max(0, a - 2), Math.max(0, b - 2)) + 
            solve(Math.max(0, a - 1), Math.max(0, b - 3))  
        );
        
        memo[a][b] = result;
        return result;
    }
}