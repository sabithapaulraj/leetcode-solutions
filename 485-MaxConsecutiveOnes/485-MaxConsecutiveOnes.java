// Last updated: 6/17/2025, 10:27:07 PM
import java.util.*;


public class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
      
      
      // Write Your Code Here 
     int count=0;
     int sol=0;
     for(int itr=0;itr<nums.length;itr++)
     {
         if(nums[itr]==1)
         {
             count++;
             sol=Math.max(count,sol);
         }
         else
         {
             count=0;
         }
     }
     return sol;
    }

}