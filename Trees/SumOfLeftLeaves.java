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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        int sum=0;
        int l=0,r=0;
             if(root.left!=null && root.left.left==null && root.left.right==null){
                 sum=sum+root.left.val;
             }
             l=sumOfLeftLeaves(root.left);
             r=sumOfLeftLeaves(root.right);
        
        return l+r+sum;  
    }
 
}