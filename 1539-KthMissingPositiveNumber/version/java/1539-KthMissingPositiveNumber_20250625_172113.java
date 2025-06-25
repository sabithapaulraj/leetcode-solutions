// Last updated: 6/25/2025, 5:21:13 PM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> numSet = new HashSet<>();
        for(int num: arr){
            numSet.add(num);
        }
        int start = 1;
        int missing = 0;
        while(missing < k){
        if(!numSet.contains(start)){
            missing++;
            if(missing == k){
                return start;
            }
        }
        start++;
        }
       return -1; 
    }
}