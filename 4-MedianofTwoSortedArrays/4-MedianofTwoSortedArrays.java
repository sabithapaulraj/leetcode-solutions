// Last updated: 9/2/2025, 7:51:20 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int merged[] = new int[n + m];
        for(int i = 0; i < n; i++){
            merged[i] = nums1[i];
        }
        for(int j = 0; j < m; j++){
            merged[n + j] = nums2[j];
        }
        Arrays.sort(merged);
        if(merged.length % 2 != 0){
            return merged[merged.length/2];
        }
        else{
            double mid1 = merged[merged.length/2];
            double mid2 = merged[merged.length/2 - 1];
            return (mid1 + mid2)/2.0;
        }
    }
}