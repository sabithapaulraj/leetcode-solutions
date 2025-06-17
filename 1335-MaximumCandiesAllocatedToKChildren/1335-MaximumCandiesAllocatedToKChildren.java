// Last updated: 6/17/2025, 10:25:57 PM
class Solution {
    private boolean Distribute(int [] candies, int candy, long k)  {
        long count = 0;
        for (int c: candies){
            count += c/candy;
            if (count>=k)
                return true;
        }
        return false;
        
    }
    public int maximumCandies(int[] candies, long k){
        long total = 0;
        for (int candy : candies){
            total += candy;
        }
        if (total < k)
            return 0;
        int left = 1, right = (int)(total / k);
        while(left < right){
            int mid = (left + right +1) /2;
            if (Distribute(candies, mid, k)){
                left = mid;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    
    }
}