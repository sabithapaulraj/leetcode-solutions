// Last updated: 6/17/2025, 10:28:16 PM
import java.util.*;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        //Type Code Here......................
        int left=0,right=nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
        
    }
}