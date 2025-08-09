// Last updated: 8/10/2025, 12:29:37 AM
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> reverseResult = new ArrayList<>();
        if(root == null){
            // BASE CASE - if tree is empty , return 
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); //initially queue has root
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            // create a new list to add nodes in current level
            List<Integer> currentLevel = new ArrayList<>();
            // iterate through the current level and add it to list
            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll(); 
                currentLevel.add(currentNode.val);
                // add current node's children to queue only if they are not null
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            // add current level list to result list(list of list)
            result.add(currentLevel);
        }
        // return the list of list for all level in reverse order
        Collections.reverse(result);
        return result;
        
    }
}