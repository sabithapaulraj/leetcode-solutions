// Last updated: 6/30/2025, 10:40:40 PM
class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (canForm(word, wordSet, new HashMap<>())) {
                result.add(word);
            }
        }
        return result;
    }
    
    private boolean canForm(String word, Set<String> wordSet, Map<String, Boolean> memo) {
        if (memo.containsKey(word)) return memo.get(word);
        
        for (int i = 1; i < word.length(); i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);
            
            if (wordSet.contains(prefix) && (wordSet.contains(suffix) || canForm(suffix, wordSet, memo))) {
                memo.put(word, true);
                return true;
            }
        }
        memo.put(word, false);
        return false;
    }
}