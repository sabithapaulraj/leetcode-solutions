// Last updated: 9/8/2025, 10:37:03 AM
class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i = 0; i < n; i++){
            int a = i; 
            int b = n - i;
            int[] arr = new int[2];
            if((a > 0) && (b > 0) && (hasZero(a) == false) && (hasZero(b) == false)){
                arr[0] = a;
                arr[1] = b;
                return arr;
            }
        }
        return new int[]{};
    }
    public boolean hasZero(int n){
        while(n > 0){
            int digit = n % 10;
            if(digit == 0){
                return true;
            }
            n = n / 10;
        }
        return false;
    }
}