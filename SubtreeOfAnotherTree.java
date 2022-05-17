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
//     boolean ans = false;
//     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
//         if(root == null && subRoot == null){
//             return true;
//         }
        
//         if(root == null || subRoot == null){
//             return false;
//         }
       
//         Queue<TreeNode> qu = new LinkedList();
//         qu.offer(root);
//         while(!qu.isEmpty()){
//                TreeNode subTree = qu.poll();
//                if(recurse(subTree,subRoot)){
//                   ans = true;
//                    break;
//                }
//             if(subTree.left!=null){
//                  qu.offer(subTree.left);
//             }
//             if(subTree.right!=null){
//                 qu.offer(subTree.right);
//             }
//         }
//         return ans;
//     }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(root == null) return false;
        if(recurse(root,subRoot)) return true;
       return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    
    public boolean recurse(TreeNode root, TreeNode subRoot){
         if(root == null && subRoot == null){
            return true;
        }
        
        if(root == null || subRoot == null){
            return false;
        }

        // System.out.println("root "+root.val+" subRoot "+subRoot.val);

        if(root.val != subRoot.val){
            return false;
        }
        
        return recurse(root.left,subRoot.left) && recurse(root.right,subRoot.right);
    }
    
}
