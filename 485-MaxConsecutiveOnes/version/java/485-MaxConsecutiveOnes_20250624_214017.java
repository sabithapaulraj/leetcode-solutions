// Last updated: 6/24/2025, 9:40:17 PM
public class Solution{
    public int findMaxConsecutiveOnes(int[] nums){
        int count = 0;
        int maximum = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 1){
                count += 1;
                if(count > maximum){
                    maximum = count;
                }
            }
                if(nums[i] == 0){
                    count = 0;
                }   
            }
        return maximum;
    }
}