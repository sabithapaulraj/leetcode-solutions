// Last updated: 8/23/2025, 6:49:58 PM
class Solution {
    public int maximum69Number (int num) {
        char[] digits = String.valueOf(num).toCharArray(); //convert num to char array
        for(int i = 0; i < digits.length; i++){ // iterate through char array
            if(digits[i] == '6'){ //find the first 6
                digits[i] = '9';// change it to 9
                break; // break immediatly after changing 6 - 9 as only one replacement allowed
            }
        }
        return Integer.parseInt(new String(digits)); //create new string for updated char array and convert it to int
        
    }
}