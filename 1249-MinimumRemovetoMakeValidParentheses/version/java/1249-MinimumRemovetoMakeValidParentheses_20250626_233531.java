// Last updated: 6/26/2025, 11:35:31 PM
class Solution {
    public String minRemoveToMakeValid(String s) {
        // Step 1: Remove invalid ')' - go left to right
        StringBuilder firstPass = new StringBuilder();
        int openCount = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                firstPass.append(c);
                openCount++;
            } else if (c == ')') {
                if (openCount > 0) {
                    firstPass.append(c);
                    openCount--;
                }
                // Skip invalid ')' when openCount is 0
            } else {
                firstPass.append(c); // Regular letters
            }
        }
        
        // Step 2: Remove invalid '(' - go right to left
        StringBuilder result = new StringBuilder();
        int closeCount = 0;
        
        for (int i = firstPass.length() - 1; i >= 0; i--) {
            char c = firstPass.charAt(i);
            
            if (c == ')') {
                result.append(c);
                closeCount++;
            } else if (c == '(') {
                if (closeCount > 0) {
                    result.append(c);
                    closeCount--;
                }
                // Skip invalid '(' when closeCount is 0
            } else {
                result.append(c); // Regular letters
            }
        }
        
        // Reverse the result since we built it backwards
        return result.reverse().toString();
    }
}