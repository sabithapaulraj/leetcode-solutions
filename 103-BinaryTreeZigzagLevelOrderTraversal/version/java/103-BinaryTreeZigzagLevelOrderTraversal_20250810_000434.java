// Last updated: 8/10/2025, 12:04:34 AM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            // BASE CASE - when tree is empty
            return result;
        }
        boolean reverse = false; // for zig zag manner
        Deque<TreeNode> queue = new LinkedList<>(); // to remove nodes from both sides
        queue.offer(root); // add root node val to queue
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0;i < levelSize; i++){
            if(!reverse){ //if zig zag path - reverse = true
                TreeNode currentNode = queue.pollFirst(); // pop first node
                currentLevel.add(currentNode.val); // add currentnode to currentlevel
                if(currentNode.left != null){
                    queue.addLast(currentNode.left); // add left node to last
                } 
                if(currentNode.right != null){
                    queue.addLast(currentNode.right); // add right node to last afetr left
                }
            }
            else{
                TreeNode currentNode = queue.pollLast(); // pop last node
                currentLevel.add(currentNode.val); // add currentnode to currentlevel
                if(currentNode.right != null){
                    queue.addFirst(currentNode.right); // add right node to first
                }
                if(currentNode.left != null){
                    queue.addFirst(currentNode.left); // add left node to first before right
                } 
            }
            }
            reverse = !reverse; // change reverse flag
            result.add(currentLevel); // add list of currentlevel to result array
        }
        return result;
        
    }
}