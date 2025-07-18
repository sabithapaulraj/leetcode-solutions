// Last updated: 7/12/2025, 11:26:32 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int count = 0;
        while(left <= right){
            if(people[left] + people[right] <= limit){
                count++;
                left++;
                right--;
            }
            else{
                count++;
                right--;
            }
        }
        return count;
    }
}