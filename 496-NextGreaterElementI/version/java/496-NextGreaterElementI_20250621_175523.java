// Last updated: 6/21/2025, 5:55:23 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] result = new int[nums1.length];

        // Brute - Force
        for(int i = 0; i<nums1.length; i++){
            int pos = -1;
            for(int j = 0; j<nums2.length; j++){
                if(nums2[j] == nums1[i]){
                    pos = j;
                    break;
                }
            }
            int nextGreater = -1;
            for(int j = pos + 1; j<nums2.length; j++){
                if(nums2[j] > nums1[i]){
                    nextGreater = nums2[j];
                    break;
                }
            }
            result[i] = nextGreater;
        }
        
        return result;
    }
    
}