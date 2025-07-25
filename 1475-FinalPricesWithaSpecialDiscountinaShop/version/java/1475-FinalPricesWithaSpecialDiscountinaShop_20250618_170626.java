// Last updated: 6/18/2025, 5:06:26 PM
class Solution {
    public int[] finalPrices(int[] prices) {
        // Optimal Solution - Monotonic Increasing Stack
       int n = prices.length;
       int[] result = prices.clone();
       Stack<Integer> stack = new Stack<>();

       // Iterating through all elements 
       for(int i = 0; i < n; i++){
        while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
            int index = stack.pop();
            result[index] = result[index] - prices[i];

        }
        stack.push(i);
       }
       return result;
        
    }
}