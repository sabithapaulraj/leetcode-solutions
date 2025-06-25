// Last updated: 6/25/2025, 6:45:53 PM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }
        for(int count : map.keySet()){
            if(map.get(count) > nums.length/2){
                return count;
            }
        }
    return -1;
    }
}