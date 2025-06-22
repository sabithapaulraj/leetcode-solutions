// Last updated: 6/22/2025, 11:13:34 PM
class Solution {
    public String[] divideString(String s, int k, char fill) {
         int n = s.length();
         // use ceiling division
        int numGroups = (n + k -1) / k;  
        String[] result = new String[numGroups];
        
        for (int i = 0; i < numGroups; i++) {
            int start = i * k;
            int end = Math.min(start + k, n);
            String group = s.substring(start, end);
            
            // If last group is incomplete, pad with fill characters
            if (group.length() < k) {
                StringBuilder sb = new StringBuilder(group);
                while (sb.length() < k) {
                    sb.append(fill);
                }
                group = sb.toString();
            }
            
            result[i] = group;
        }
        
        return result;
        
    }
}