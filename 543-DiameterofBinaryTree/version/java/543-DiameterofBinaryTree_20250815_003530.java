// Last updated: 8/15/2025, 12:35:30 AM
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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        // recursive left node of each node
        int leftHeight = height(root.left);
        // recursive right node of each node
        int rightHeight = height(root.right);
        // diameter of each node
        int dm = leftHeight + rightHeight + 1;
        // maximum diameter
        diameter = Math.max(diameter, dm);
        
        return Math.max(leftHeight, rightHeight) + 1;
    
    }

}