// Last updated: 8/9/2025, 8:28:52 PM
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null){
            // BASE CASE - if tree is empty , return 
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); //initially queue has root
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            // to store sum of nodes in current level
            double currentLevel = 0;
            // to calculate average of current level
            double averageOfLevel = 0;

            // iterate through the current level and add it to list
            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll(); 
                // add current node to current level
                currentLevel += currentNode.val;
                // add current node's children to queue only if they are not null
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            // calculate average
            averageOfLevel = currentLevel / levelSize;
            // add average of current level to result
            result.add(averageOfLevel);
        }
        // return the list of average for all level
        return result;
    }
}