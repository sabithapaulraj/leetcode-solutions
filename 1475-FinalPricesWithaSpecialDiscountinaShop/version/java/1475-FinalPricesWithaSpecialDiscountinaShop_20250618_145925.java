// Last updated: 6/18/2025, 2:59:25 PM
import java.util.Stack;
class Solution {
    public int[] finalPrices(int[] prices) {
        // Optimized Approach : Monotonic Stack(Decreasing)
        int n = prices.length;
        int[] result = prices.clone();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < n; i++){
            // Process all items in stack that can get discount from current item
            // Monotonic Stack Implementation
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                int index = stack.pop();
                result[index] -= prices[i];
            }
            stack.push(i);
        }
        return result;
        
    }
}