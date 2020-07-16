/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder == null){
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[0]);
        
        for(int i=1;i<preorder.length;i++){
            
            root = helper(root,preorder[i]);
            
        }
        
        return root;
    }
    
    TreeNode helper(TreeNode root, int val){
        if(root==null)return new TreeNode(val);
        
        if(val<root.val){
            root.left = helper(root.left,val);
        }else{
            root.right = helper(root.right,val);
        }
        return root;
    }
}