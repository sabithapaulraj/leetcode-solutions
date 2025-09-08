// Last updated: 9/8/2025, 10:29:27 AM
class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int a = 1; a < n; a++){
            int b = n - a;
            int[] arr = new int[2];
            if(!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0")){
                arr[0] = a;
                arr[1] = b;
                return arr;
            }
        }
        return new int[]{};
    }
}