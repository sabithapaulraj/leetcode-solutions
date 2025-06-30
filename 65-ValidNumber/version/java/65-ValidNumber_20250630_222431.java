// Last updated: 6/30/2025, 10:24:31 PM
public class Solution {
    public boolean isNumber(String s) {
        return s.trim().matches("[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?");
    }
}
