// Last updated: 6/30/2025, 11:04:28 PM
class Solution {
    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        
        String[] bigString = {"Thousand", "Million", "Billion"};
        String result = numberToWordsHelper(num % 1000);
        num /= 1000;
        
        for (int i = 0; i < bigString.length; i++) {
            if (num > 0 && num % 1000 > 0) {
                result = numberToWordsHelper(num % 1000) + bigString[i] + " " + result;
            }
            num /= 1000;
        }
        
        return result.trim();
    }
    
    private String numberToWordsHelper(int num) {
        String[] digitString = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teenString = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tenString = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        
        String result = "";
        
        if (num > 99) {
            result += digitString[num / 100] + " Hundred ";
            num %= 100;
        }
        
        if (num < 20 && num > 9) {
            result += teenString[num - 10] + " ";
        } else {
            if (num >= 20) {
                result += tenString[num / 10] + " ";
                num %= 10;
            }
            if (num > 0) {
                result += digitString[num] + " ";
            }
        }
        
        return result;
    }
}