// Last updated: 6/25/2025, 12:58:45 PM
class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            int newDigit = digits[i] + carry;
            if(newDigit >= 10){
                digits[i] = 0;
            }
            else if(newDigit < 10){
                digits[i] = newDigit;
                carry = 0;
                break;
            }
        }
        if(carry == 1){
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        } 
    return digits;
    }
}