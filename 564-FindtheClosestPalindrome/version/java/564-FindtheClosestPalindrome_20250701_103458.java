// Last updated: 7/1/2025, 10:34:58 AM
class Solution {
    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);
        int len = n.length();
        // Handle edge cases
        if (num <= 10) {
            return String.valueOf(num - 1);
        }
        if (num == 11) {
            return "9";
        }
        // Get left half of the number
        long left = Long.parseLong(n.substring(0, (len + 1) / 2));
        // Generate 5 palindrome candidates
        long[] candidates = new long[5];
        candidates[0] = buildPalindrome(left - 1, len % 2 == 0);  // left-1 mirrored
        candidates[1] = buildPalindrome(left, len % 2 == 0);      // left mirrored
        candidates[2] = buildPalindrome(left + 1, len % 2 == 0);  // left+1 mirrored
        candidates[3] = (long) Math.pow(10, len - 1) - 1;        // 999...9
        candidates[4] = (long) Math.pow(10, len) + 1;            // 100...001
        
        // Find the closest palindrome
        long minDiff = Long.MAX_VALUE;
        long closest = 0;
        
        for (long candidate : candidates) {
            if (candidate == num) {
                continue; // Skip the original number
            }
            
            long diff = Math.abs(candidate - num);
            if (diff < minDiff || (diff == minDiff && candidate < closest)) {
                minDiff = diff;
                closest = candidate;
            }
        }
        
        return String.valueOf(closest);
    }
    
    private long buildPalindrome(long left, boolean isEven) {
        long palindrome = left;
        
        // For odd length, remove the middle digit before mirroring
        if (!isEven) {
            left = left / 10;
        }
        
        // Mirror the remaining digits
        while (left > 0) {
            palindrome = palindrome * 10 + left % 10;
            left = left / 10;
        }
        
        return palindrome;
    }
}