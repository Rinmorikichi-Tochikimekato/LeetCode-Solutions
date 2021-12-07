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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        
        int leftL = minDepth(root.left);
        int rightL = minDepth(root.right);
        if(leftL == 0 ) return rightL + 1;
        if(rightL == 0 ) return leftL + 1;
        
        if(leftL<rightL) return leftL + 1;
        else return rightL + 1;
    }
}
