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
    public int findTilt(TreeNode root) {
        PairTilt ans=find(root);
        return ans.tilt;
    }
    public PairTilt find(TreeNode root){
        if(root==null){
            PairTilt p=new PairTilt();
            p.sum=0;
            p.tilt=0;
            return p;
        } 
        PairTilt ans=new PairTilt();
        PairTilt l=find(root.left);
        PairTilt r=find(root.right);
        ans.sum=root.val+l.sum+r.sum;
        ans.tilt=l.tilt+r.tilt+(int)Math.abs(l.sum-r.sum);
        return ans;
        
    }
    class PairTilt{
        int sum;
        int tilt;
    }
}