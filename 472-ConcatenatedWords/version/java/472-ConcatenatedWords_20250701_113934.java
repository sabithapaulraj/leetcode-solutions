// Last updated: 7/1/2025, 11:39:34 AM
class Solution {
    public HashSet<String> set;
    public HashMap<String , Boolean> map;
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        set = new HashSet<>(Arrays.asList(words));
        map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(String c : words){
            if(isConcat(c)){
                result.add(c);
            }
        }
        return result;
    }
    public boolean isConcat(String word){
        if(map.containsKey(word)){
            return map.get(word);
        }
        for(int i = 1; i<word.length(); i++){
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);
            if(set.contains(prefix) && (set.contains(suffix) || isConcat(suffix))){
                map.put(word, true);
                return true;
            }
        }
        map.put(word, false);
        return false;
    }
}