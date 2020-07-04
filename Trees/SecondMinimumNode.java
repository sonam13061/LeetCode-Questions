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
    public int findSecondMinimumValue(TreeNode root) {
     List<Integer> list=new ArrayList<>();
        inorder(root,list);
        if(list.size()==1){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int secmin=Integer.MAX_VALUE-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)<min){
                secmin=min;
                min=list.get(i);
            }
            else if(list.get(i)<secmin){
                secmin=list.get(i);
            }
        }
        return secmin;
    }
    public void inorder(TreeNode node,List<Integer> list){
        if(node==null){
            return;
        }
      
        inorder(node.left,list);
        if(!list.contains(node.val)){
        list.add(node.val);
        }
        inorder(node.right,list);
    }
}