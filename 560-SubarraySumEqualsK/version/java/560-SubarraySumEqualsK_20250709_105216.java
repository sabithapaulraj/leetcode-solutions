// Last updated: 7/9/2025, 10:52:16 AM
class Solution{
   public int subarraySum(int[] nums, int k) {
    int count = 0, n = nums.length;
    int[] prefix = new int[n+1];
    for (int i = 0; i < n; i++) {
        prefix[i+1] = prefix[i] + nums[i];
    }
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            if (prefix[j+1] - prefix[i] == k) count++;
        }
    }
    return count;
}
}