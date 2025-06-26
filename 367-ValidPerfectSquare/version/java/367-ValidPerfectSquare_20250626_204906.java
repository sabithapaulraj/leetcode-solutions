// Last updated: 6/26/2025, 8:49:06 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        long i = 1;
        while(i * i <= num){
            if(i * i == num){
                return true;
            }
            i++;
        }
        return false;
    }
}