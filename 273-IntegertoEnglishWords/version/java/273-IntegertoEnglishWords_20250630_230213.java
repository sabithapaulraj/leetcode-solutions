// Last updated: 6/30/2025, 11:02:13 PM
class Solution {
    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        
        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] thousands = {"", "Thousand", "Million", "Billion"};
        
        String result = "";
        int i = 0;
        
        while (num > 0) {
            if (num % 1000 != 0) {
                result = convert(num % 1000, ones, teens, tens) + thousands[i] + " " + result;
            }
            num /= 1000;
            i++;
        }
        
        return result.trim();
    }
    
    private String convert(int num, String[] ones, String[] teens, String[] tens) {
        String result = "";
        
        if (num >= 100) {
            result += ones[num / 100] + " Hundred ";
            num %= 100;
        }
        
        if (num >= 20) {
            result += tens[num / 10] + " ";
            num %= 10;
        } else if (num >= 10) {
            result += teens[num - 10] + " ";
            num = 0;
        }
        
        if (num > 0) {
            result += ones[num] + " ";
        }
        
        return result;
    }
}