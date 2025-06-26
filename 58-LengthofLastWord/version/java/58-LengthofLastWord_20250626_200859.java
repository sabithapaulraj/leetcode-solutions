// Last updated: 6/26/2025, 8:08:59 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for(int i = s.length() - 1; i>=0; i--){
            char c = s.charAt(i);
            if(s.charAt(i) == ' '){
                if(length > 0){
                    break;
                }
            }
            if(s.charAt(i) != ' '){
                length += 1;
            }
        }
        return length;
    }
}