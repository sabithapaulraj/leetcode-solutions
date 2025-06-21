// Last updated: 6/21/2025, 11:50:03 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Monotonic Stack
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<temperatures.length; i++){
            // compare the values not the indices
            while(!stack.isEmpty() && (temperatures[stack.peek()] < temperatures[i])){
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }
        return answer;
    }
}