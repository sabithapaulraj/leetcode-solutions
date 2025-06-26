// Last updated: 6/26/2025, 8:33:38 PM
class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsValue(c)){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(stack.peek() == map.get(c)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            
        }
        return stack.isEmpty();

    }
}