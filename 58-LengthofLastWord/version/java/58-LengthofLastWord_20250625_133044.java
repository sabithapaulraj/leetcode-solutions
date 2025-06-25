// Last updated: 6/25/2025, 1:30:44 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for(int i = s.length() - 1; i>=0; i--){
            if(s.charAt(i) == ' '){
                // skip spaces
                // after word encountered
                if(length > 0){
                    break;
                }
            }
            if(s.charAt(i) != ' '){
                length++;
            } 
        }
        return length;
    }
}