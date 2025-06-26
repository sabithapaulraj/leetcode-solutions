// Last updated: 6/26/2025, 8:24:55 PM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }
        for(int count : map.keySet()){
            if(map.get(count) > (nums.length/2)){
                return count;
            }
        }
        return -1;
    }
}