// Last updated: 6/26/2025, 8:59:04 PM
public class Solution {
    public boolean hasMatch(String s, String p) {
        int index = p.indexOf('*');
        int String1 = s.indexOf(p.substring(0 , index));
        int String2 = s.indexOf(p.substring(index+1), String1 + p.substring(0, index).length());
        if(String1 != -1 && String2 != -1){
            return true;
        }
        return false;
    }
}