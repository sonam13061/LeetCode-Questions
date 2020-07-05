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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        TreeNode ans=remove(root,target);
        if(ans.left==null && ans.right==null && root.val==target){
            ans=null;
        }
        return ans;
    }
     public TreeNode remove(TreeNode root, int target) {
        if(root==null){
            return null;
        }
        
        TreeNode l=remove(root.left,target);
        TreeNode r=remove(root.right,target);
        if( l!=null && l.left==null && l.right==null && l.val==target){
            root.left=null;
        }
        if(r!=null && r.left==null && r.right==null && r.val==target){
            root.right=null;
        }
        return root;
    }
}