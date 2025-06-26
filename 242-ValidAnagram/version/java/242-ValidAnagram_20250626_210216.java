// Last updated: 6/26/2025, 9:02:16 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] String1 = s.toCharArray();
        char[] String2 = t.toCharArray();
        Arrays.sort(String1);
        Arrays.sort(String2);
        return Arrays.equals(String1, String2);
    }
}