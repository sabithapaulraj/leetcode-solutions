// Last updated: 7/9/2025, 10:58:05 AM
class Solution{
     public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
             if (map.get(sum) != null) {
                map.put(sum, map.get(sum) + 1);
                }
                else {
                    map.put(sum, 1);
                }
            }
        return count;
}
}