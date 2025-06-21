// Last updated: 6/21/2025, 6:24:50 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Monotonic Stack + Hashmap (Optimal)
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // processing num2 to find next greater element
        for(int num:nums2){
            //pop smaller elements than current num
            while(!stack.isEmpty() && stack.peek() < num){
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        //nums with no greater element pop
        while(!stack.isEmpty()){
            nextGreaterMap.put(stack.pop(), -1);
        }
        // result array
        int[] result = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            result[i] = nextGreaterMap.get(nums1[i]);
        }
        return result;    
        
    }
    
}