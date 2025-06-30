// Last updated: 6/30/2025, 10:59:20 PM
class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        
        // Empty pattern matches empty string
        dp[0][0] = true;
        
        // Handle patterns like a*, a*b*, a*b*c* that can match empty string
        for (int j = 2; j <= p.length(); j += 2) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = true;
            } else {
                break;
            }
        }
        
        // Fill the DP table
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);
                
                if (pc == '*') {
                    // * can match 0 or more of previous character
                    char prev = p.charAt(j - 2);
                    dp[i][j] = dp[i][j - 2]; // Match 0 times
                    
                    if (prev == '.' || prev == sc) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j]; // Match 1+ times
                    }
                } else if (pc == '.' || pc == sc) {
                    // Characters match
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        
        return dp[s.length()][p.length()];
    }
}