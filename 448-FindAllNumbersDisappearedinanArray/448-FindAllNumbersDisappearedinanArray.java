// Last updated: 8/23/2025, 8:23:11 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> seen = new HashSet<>();
        for(int x : nums){
            seen.add(x);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(!seen.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}