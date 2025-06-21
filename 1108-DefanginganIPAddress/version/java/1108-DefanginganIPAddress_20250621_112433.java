// Last updated: 6/21/2025, 11:24:33 AM
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder replacedIP = new StringBuilder();

        for(char c : address.toCharArray()){
            if(c == '.'){
                replacedIP.append("[.]");
            }
            else{
                replacedIP.append(c);
            }
        }
        return replacedIP.toString();
        
    }
}