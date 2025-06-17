// Last updated: 6/17/2025, 10:28:06 PM
import java.util.Scanner;

public class Solution {
    public boolean isNumber(String s) {
        if (s == null || s.isEmpty()) return false;
        s = s.trim();
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenExp = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                seenDigit = true;
            } else if (c == '+' || c == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (c == '.') {
                if (seenDot || seenExp) return false;
                seenDot = true;
            } else if (c == 'e' || c == 'E') {
                if (seenExp || !seenDigit) return false;
                seenExp = true;
                seenDigit = false; 
            } else {
                return false;
            }
        }

        return seenDigit;
    }
}