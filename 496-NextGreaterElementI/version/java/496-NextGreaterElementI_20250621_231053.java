// Last updated: 6/21/2025, 11:10:53 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // create Hash Map for storing next greater elements
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        // Monotonically Decreasing Stack to find next greater element
        Stack<Integer> stack = new Stack<>();

        // Iterate through nums2
        for(int num : nums2){
            while(!stack.isEmpty() && (stack.peek()<num)){
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }
        // for elements with no next greater number
        while(!stack.isEmpty()){
            nextGreaterMap.put(stack.pop(), -1);
        }
        int[] result = new int[nums1.length];
        for(int i = 0; i< nums1.length; i++){
            result[i] = nextGreaterMap.get(nums1[i]);
        }
        return result;
    }
    
}