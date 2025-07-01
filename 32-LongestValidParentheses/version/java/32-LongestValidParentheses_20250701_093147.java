// Last updated: 7/1/2025, 9:31:47 AM
class Solution {
    public int longestValidParentheses(String s) {
       Stack<Integer> stack = new Stack<>();
       int max = 0;
       stack.push(-1);
       for(int i = 0; i< s.length(); i++){
        if(s.charAt(i) == '('){
            stack.push(i);
        }
        else{
            stack.pop();
            if(stack.isEmpty()){
                stack.push(i);
            }
        }
        max = Math.max(max, i - stack.peek());
       }
       return max;
    }
}
