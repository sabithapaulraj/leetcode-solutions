// Last updated: 6/17/2025, 10:28:09 PM
public class Solution 
{
    public int maxSubArray(int[] nums)
    {
        int curr = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length;i++)
        {
            curr = Math.max(nums[i],nums[i]+curr);
            max = Math.max(curr,max);
        }
        return max;
    }
}
