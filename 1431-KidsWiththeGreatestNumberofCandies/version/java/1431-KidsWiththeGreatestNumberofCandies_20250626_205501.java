// Last updated: 6/26/2025, 8:55:01 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maximum = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > maximum){
                maximum = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= maximum){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}