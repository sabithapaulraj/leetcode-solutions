// Last updated: 6/17/2025, 10:28:11 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>map = new HashMap<>();
        for(String str:strs){
            char[]charArray=str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        
        }
        return new ArrayList<>(map.values());
        }
        
    }



