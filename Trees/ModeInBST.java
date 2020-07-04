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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        inorder(root,mp);
        int max=0;
        for(Integer key:mp.keySet()){
            max=Math.max(max,mp.get(key));
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(Integer key:mp.keySet()){
            if(mp.get(key)==max){
                list.add(key);
            }
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
    public void inorder(TreeNode node,HashMap<Integer,Integer>mp){
        if(node==null){
            return;
        }
      
        inorder(node.left,mp);
        if(mp.containsKey(node.val)){
            int val=mp.get(node.val);
            mp.put(node.val,val+1);
        }
        else{
            mp.put(node.val,1);
        }
        inorder(node.right,mp);
    }
}