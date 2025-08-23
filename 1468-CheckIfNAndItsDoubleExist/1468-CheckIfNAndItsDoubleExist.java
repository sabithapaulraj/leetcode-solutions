// Last updated: 8/23/2025, 6:49:53 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
       Set<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            if (seen.contains(num * 2) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}