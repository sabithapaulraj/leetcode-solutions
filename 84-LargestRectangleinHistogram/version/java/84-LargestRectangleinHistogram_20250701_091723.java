// Last updated: 7/1/2025, 9:17:23 AM
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int maxArea = 0;
        int currentHeight;
        for(int i = 0; i<=n; i++){
            if(i == n){
                currentHeight = 0;
            }
            else{
                currentHeight = heights[i];
            }
            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]){
            int height = heights[stack.pop()];
            int width;
            if(stack.isEmpty()){
                width = i;
            }
            else{
                width = i - stack.peek() - 1;
            }
            maxArea = Math.max(maxArea, height * width);
        }
        stack.push(i);
        }
       
        return maxArea;
    }
}
