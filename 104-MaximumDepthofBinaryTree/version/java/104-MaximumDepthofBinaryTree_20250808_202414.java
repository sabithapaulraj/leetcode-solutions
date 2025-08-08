// Last updated: 8/8/2025, 8:24:14 PM
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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        // max depth = 1 + maximum depth between left subtree and right subtree
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        int maxDepth = 1+ Math.max(leftDepth, rightDepth);
        return maxDepth;
        
    }
}