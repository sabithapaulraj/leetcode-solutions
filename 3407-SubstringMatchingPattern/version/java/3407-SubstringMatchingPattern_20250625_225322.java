// Last updated: 6/25/2025, 10:53:22 PM
public class Solution {
    public boolean hasMatch(String s, String p) {
        int index=p.indexOf("*");
        int string1=s.indexOf(p.substring(0,index));
        int string2 = s.indexOf(p.substring(index+1), string1 + p.substring(0,index).length());
        if(string1!=-1 && string2!=-1)
        return true;
        return false;
    }
}