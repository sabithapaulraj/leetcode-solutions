// Last updated: 6/26/2025, 11:52:19 PM
class Solution {
    public int coinChange(int[] coins, int amount) {
        // dp[i] = minimum coins needed to make amount i
        int[] dp = new int[amount + 1];
        
        // Initialize with impossible value (amount + 1)
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;  // Impossible value
        }
        
        // Base case: 0 coins needed to make amount 0
        dp[0] = 0;
        
        // Fill the dp array
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    // Try using this coin
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        
        // Return result - check if solution exists
        if (dp[amount] == amount + 1) {
            return -1;  // No solution possible
        } else {
            return dp[amount];  // Return minimum coins needed
        }
    }
}