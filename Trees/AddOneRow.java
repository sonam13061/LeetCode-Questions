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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1){
            TreeNode newRoot=new TreeNode(v,root,null);
            return newRoot;
        }
        TreeNode ans=add(root,v,d,1);
        return ans;
    }
    public TreeNode add(TreeNode root,int v,int d,int level){
        if(root==null){
            return null;
        }
        TreeNode l=add(root.left,v,d,level+1);
        TreeNode r=add(root.right,v,d,level+1);
        if(level==d-1){
            root.left=new TreeNode(v,l,null);
            root.right=new TreeNode(v,null,r);
        }
        return root;
        

    }
}