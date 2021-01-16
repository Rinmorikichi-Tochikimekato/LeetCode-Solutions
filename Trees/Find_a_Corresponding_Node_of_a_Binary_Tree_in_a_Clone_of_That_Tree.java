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
    TreeNode tempNode=null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null || tempNode!=null ) return tempNode;
        if(original == target) {
            tempNode = cloned;
            return tempNode;
        }
        getTargetCopy(original.left,cloned.left,target);
        getTargetCopy(original.right,cloned.right,target);
        return tempNode;
    }
}
