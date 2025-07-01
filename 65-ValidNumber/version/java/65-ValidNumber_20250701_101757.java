// Last updated: 7/1/2025, 10:17:57 AM
public class Solution {
    public boolean isNumber(String s) {
        if (s.isEmpty()) return false;

        s = s.trim();
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenExp = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                seenDigit = true;
            } else if (c == '+' || c == '-') {
                // Sign is valid only at the start or right after an 'e' or 'E'
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (c == '.') {
                // Dot is invalid if we've already seen one, or seen exponent
                if (seenDot || seenExp) return false;
                seenDot = true;
            } else if (c == 'e' || c == 'E') {
                // e/E must come after a digit and only once
                if (seenExp || !seenDigit) return false;
                seenExp = true;
                seenDigit = false; // Need digit after 'e'
            } else {
                // Any other character is invalid
                return false;
            }
        }

        return seenDigit;
    }
}
