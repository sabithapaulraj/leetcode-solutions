// Last updated: 6/17/2025, 10:27:29 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] String1 = s.toCharArray();
        char[] String2 = t.toCharArray();
        Arrays.sort(String1);
        Arrays.sort(String2);
        return Arrays.equals(String1, String2);
        
    }
}