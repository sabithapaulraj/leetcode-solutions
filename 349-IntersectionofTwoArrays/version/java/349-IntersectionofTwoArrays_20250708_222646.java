// Last updated: 7/8/2025, 10:26:46 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] present = new boolean[1001];
        for (int num : nums1) {
            present[num] = true;
        }
        
        List<Integer> result = new ArrayList<>();
        boolean[] added = new boolean[1001]; 

        for (int num : nums2) {
            if (present[num] && !added[num]) {
                result.add(num);
                added[num] = true;
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
        
    }
}