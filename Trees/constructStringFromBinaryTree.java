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
    public String tree2str(TreeNode t) {
        ArrayList<String> list=new ArrayList<>();
        if(t==null){
            return "";
        }
        list.add(t.val+"");
        Treetostring(t,list);
        System.out.println(list);
        return list.get(0);
    }
    public void Treetostring(TreeNode t,ArrayList<String> list){
        if( t== null ||(t.left==null && t.right==null)){
            return;
        }
        list.set(0,list.get(0)+'(');
        if(t.left!=null){
             list.set(0,list.get(0)+t.left.val);
        }
        Treetostring(t.left,list);
     list.set(0,list.get(0)+')');
      
        if(t.right!=null){
             list.set(0,list.get(0)+'(');
           list.set(0,list.get(0)+t.right.val);
        }
        Treetostring(t.right,list);
        if(t.right!=null){
         list.set(0,list.get(0)+')');
        }
    }
}