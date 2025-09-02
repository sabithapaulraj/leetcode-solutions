// Last updated: 9/2/2025, 7:53:13 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int merged[] = new int[n + m];
        // copy of arr1
        for(int i = 0; i < n; i++){
            merged[i] = nums1[i];
        }
        //copy of arr2 added to arr1
        for(int j = 0; j < m; j++){
            merged[n + j] = nums2[j];
        }
        //sort new arr
        Arrays.sort(merged);
        //if merged arr odd length - mid element is median
        if(merged.length % 2 != 0){
            return merged[merged.length/2];
        }
        // if merged arr even length - sum of mid element and previous element / 2 is median
        else{
            double mid1 = merged[merged.length/2];
            double mid2 = merged[merged.length/2 - 1];
            return (mid1 + mid2)/2.0;
        }
    }
}