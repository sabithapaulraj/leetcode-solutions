// Last updated: 6/17/2025, 10:28:07 PM
public class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        int i = s.length()-1;
        while(i >= 0 && s.charAt(i) == ' ')
        {
            i--;
        }
        int j = i;
        while(j >= 0 && s.charAt(j) != ' ')
        {
            j--;
        }
        return i - j;
    }

}
