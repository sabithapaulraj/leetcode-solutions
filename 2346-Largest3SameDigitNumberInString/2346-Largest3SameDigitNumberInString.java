// Last updated: 8/17/2025, 8:38:46 PM
class Solution {
    public String largestGoodInteger(String num) {
        char maxGoodInteger = 0;
        for(int i = 0; i < num.length() - 2; i++){
            char current = num.charAt(i);
            if(current == num.charAt(i + 1) && current == num.charAt(i + 2)){
                if(current > maxGoodInteger){
                    maxGoodInteger = current;
                }
            }
        }
        if(maxGoodInteger != 0){
            return String.valueOf(maxGoodInteger)+maxGoodInteger+maxGoodInteger;
            }
        else{
            return "";
            }
    }
}