// Last updated: 6/25/2025, 6:42:18 PM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num , 0) + 1);
        }
        for(int count : map.keySet()){
            if(map.get(count) > nums.length/2){
                return count;
            }
        }
    return -1;
    }
}