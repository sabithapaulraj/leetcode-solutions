// Last updated: 8/8/2025, 8:06:08 PM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }
    public void helper(TreeNode node, List<Integer> result){
        if(node == null) return;
        else if(node != null){
        result.add(node.val);       //root
        helper(node.left, result);  //left
        helper(node.right, result); //right
    }
    }
}