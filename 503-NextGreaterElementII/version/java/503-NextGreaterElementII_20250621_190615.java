// Last updated: 6/21/2025, 7:06:15 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); 
        
        Stack<Integer> stack = new Stack<>();
    
        for (int i = 0; i < 2 * n; i++) {
            int currentIndex = i % n; 
            int currentValue = nums[currentIndex];

            while (!stack.isEmpty() && nums[stack.peek()] < currentValue) {
                int prevIndex = stack.pop();

                if (prevIndex < n) {
                    result[prevIndex] = currentValue;
                }
            }
            if (i < n) {
                stack.push(currentIndex);
            }
        }
        
        return result;
    }
}