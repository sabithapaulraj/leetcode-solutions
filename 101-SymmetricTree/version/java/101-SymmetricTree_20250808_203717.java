// Last updated: 8/8/2025, 8:37:17 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        //check if left and right subtrees are mirrors of each other
        // BASE CASE 1 -  if empty left and right subtrees - Symmetric
        // BASE CASE 2 - if only one value - Non Symmetric
        // BASE CASE 3 -  different value - Non Symmetric
        // isMirror(left, right) - 
                        // left.left = right.right
                        // left.right = right.left
        return root == null || isMirror(root.left, root.right);
        
    }
    public boolean isMirror(TreeNode left, TreeNode right){
        //Base case 1
        if(left == null && right == null){
            return true;
        }
        // Base case 2
        if(left == null || right == null){
            return false;
        }
        // Base Case 3
        if(left.val != right.val){
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}