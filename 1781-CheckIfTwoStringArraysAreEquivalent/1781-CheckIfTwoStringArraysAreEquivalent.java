// Last updated: 8/23/2025, 6:49:33 PM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Time Complexity : O(n + m) // Space Complexity : O(1)
        int i1 = 0, j1 = 0; // i1: array index, j1: character index in current string
        int i2 = 0, j2 = 0; // i2: array index, j2: character index in current string
        
        while (i1 < word1.length && i2 < word2.length) {
            // Compare current characters
            if (word1[i1].charAt(j1) != word2[i2].charAt(j2)) {
                return false;
            }
            
            // Move to next character in word1
            j1++;
            if (j1 == word1[i1].length()) {
                i1++;
                j1 = 0;
            }
            
            // Move to next character in word2
            j2++;
            if (j2 == word2[i2].length()) {
                i2++;
                j2 = 0;
            }
        }
        
        // Both should reach the end simultaneously
        return i1 == word1.length && i2 == word2.length;
    }

}