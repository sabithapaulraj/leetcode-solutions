// Last updated: 7/1/2025, 12:17:44 PM
class Solution {
    public String[] belowtwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    public String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"} ;
    public String numberToWords(int num) {
        if(num == 0){
            return "Zero";
        }
        return helper(num);
    }
    public String helper(int num){
        StringBuilder sb = new StringBuilder();
        if(num < 20){
            sb.append(belowtwenty[num]);
        }
        else if(num < 100){
            sb.append(tens[num/10]).append(" ").append(belowtwenty[num%10]);
        }
        else if(num < 1000){
            sb.append(helper(num/100)).append(" Hundred ").append(helper(num%100));
        }
        else if(num < 1000000){
            sb.append(helper(num/1000)).append(" Thousand ").append(helper(num%1000));
        }
        else if(num < 1000000000){
            sb.append(helper(num/1000000)).append(" Million ").append(helper(num%1000000));
        }
        else{
            sb.append(helper(num/1000000000)).append(" Billion ").append(helper(num%1000000000));
        }
        return sb.toString().trim();
    }
}