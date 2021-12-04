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
    public int maxLevelSum(TreeNode root) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int level = 1;
        int curLevel = 1;
        int elementCounter=0;
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            elementCounter = q.size();
            
            while(elementCounter > 0){
                TreeNode temp = q.remove();
                 // System.out.print(temp.val + " ");
                sum += temp.val;
                
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                elementCounter--;
            }
            
            if(sum > maxSum){
                curLevel = level;
                maxSum = sum;
            }
            sum = 0;
            level++;
            // System.out.println(" Sum = " + maxSum + " level = " + curLevel);
        }
        return curLevel;
    }
}
