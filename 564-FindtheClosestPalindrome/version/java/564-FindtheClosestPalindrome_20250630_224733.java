// Last updated: 6/30/2025, 10:47:33 PM
class Solution {
    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);
        int len = n.length();
        
        List<Long> candidates = new ArrayList<>();
        
        // Edge cases: shorter and longer palindromes
        candidates.add((long) Math.pow(10, len - 1) - 1);  // 999...9
        candidates.add((long) Math.pow(10, len) + 1);      // 100...001
        
        // Get the prefix (left half)
        boolean isOdd = len % 2 == 1;
        int mid = (len + 1) / 2;
        String prefix = n.substring(0, mid);
        long prefixNum = Long.parseLong(prefix);
        
        // Try prefix-1, prefix, prefix+1
        for (long i = prefixNum - 1; i <= prefixNum + 1; i++) {
            String candidate = buildPalindrome(String.valueOf(i), isOdd);
            if (candidate.length() == len) {  // Only add if same length
                candidates.add(Long.parseLong(candidate));
            }
        }
        
        // Find the closest one (excluding the original number)
        long result = 0;
        long minDiff = Long.MAX_VALUE;
        
        for (long candidate : candidates) {
            if (candidate == num) continue;
            long diff = Math.abs(candidate - num);
            if (diff < minDiff || (diff == minDiff && candidate < result)) {
                minDiff = diff;
                result = candidate;
            }
        }
        
        return String.valueOf(result);
    }
    
    private String buildPalindrome(String half, boolean isOdd) {
        StringBuilder sb = new StringBuilder(half);
        int start = isOdd ? half.length() - 2 : half.length() - 1;
        for (int i = start; i >= 0; i--) {
            sb.append(half.charAt(i));
        }
        return sb.toString();
    }
}