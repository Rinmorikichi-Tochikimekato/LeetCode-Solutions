/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SolutionIterative {
    public boolean isSymmetric(TreeNode root) {
        TreeNode q = root;
        TreeNode p = root;
        
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(p);
        que.add(q);
        
        while(!que.isEmpty()){
            p=que.poll();
            q = que.poll();
            
            if(p==null&&q==null){
              continue;
            }
            if(p==null||q==null){
                return false;
            }
            if(p.val!=q.val){
                return false;
            }
            
            que.add(p.left);
            que.add(q.right);
            que.add(p.right);
            que.add(q.left); 
            
        }
        
        
     return true;
        
    }
    
//     public boolean helper(TreeNode p, TreeNode q){
        
//         if(p==null && q==null){
//             return true;
//         }
        
//         if(p==null || q==null){
//             return false;
//         }
        
//         if(p.val!=q.val){
//             return false;
//         }
        
//         return helper(p.left,q.right) && helper(p.right,q.left);
        
//     }
    
}