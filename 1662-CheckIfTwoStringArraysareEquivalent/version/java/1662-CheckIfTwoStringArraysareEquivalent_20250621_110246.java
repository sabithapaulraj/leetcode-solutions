// Last updated: 6/21/2025, 11:02:46 AM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Time Complexity : O(n + m) // Space Complexity : O(n + m)
        StringBuilder String1 = new StringBuilder();
        StringBuilder String2 = new StringBuilder();

        for(String word : word1){
            String1.append(word);
        }
        for(String word : word2){
            String2.append(word);
        }

        return String1.toString().equals(String2.toString());
    }

}