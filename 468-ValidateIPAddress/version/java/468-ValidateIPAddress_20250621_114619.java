// Last updated: 6/21/2025, 11:46:19 AM
class Solution {
    public String validIPAddress(String queryIP) {
        if (isValidIPv4(queryIP)) {
            return "IPv4";
        } else if (isValidIPv6(queryIP)) {
            return "IPv6";
        } else {
            return "Neither";
        }
    }
    
    private boolean isValidIPv4(String queryIP) {
        String[] parts = queryIP.split("\\.", -1); // -1 to keep empty strings
        
        // Must have exactly 4 parts
        if (parts.length != 4) {
            return false;
        }
        
        for (String part : parts) {
            // Empty string or too long
            if (part.length() == 0 || part.length() > 3) {
                return false;
            }
            
            // Check for leading zeros 
            if (part.length() > 1 && part.charAt(0) == '0') {
                return false;
            }
            
            // Check if all characters are digits
            for (char c : part.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            
            // Check if number is in range 0-255
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isValidIPv6(String ip) {
        String[] parts = ip.split(":", -1); // -1 to keep empty strings
        
        // Must have exactly 8 parts
        if (parts.length != 8) {
            return false;
        }
        
        for (String part : parts) {
            // Must be 1-4 characters
            if (part.length() == 0 || part.length() > 4) {
                return false;
            }
            
            // Check if all characters are valid hexadecimal
            for (char c : part.toCharArray()) {
                if (!((c >= '0' && c <= '9') || 
                      (c >= 'a' && c <= 'f') || 
                      (c >= 'A' && c <= 'F'))) {
                    return false;
                }
            }
        }
        
        return true;
    }
}