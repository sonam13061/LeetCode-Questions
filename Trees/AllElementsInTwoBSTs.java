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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
    List<Integer> first=new ArrayList<>();
        inorder(root1,first);
        List<Integer> second=new ArrayList<>();
        inorder(root2,second);
        int i=0,j=0;
        List<Integer> ans=new ArrayList<>();
        while(i<first.size() && j<second.size()){
             if(first.get(i)<second.get(j)){
               
                 ans.add(first.get(i));
                   i++;
             }
            else{
              
                ans.add(second.get(j));
                  j++;
            }
        }
        if(i!=first.size()){
            while(i<first.size()){
                ans.add(first.get(i));
                i++;
            }
        }
        if(j!=second.size()){
            while(j<second.size()){
                ans.add(second.get(j));
                j++;
            }
        }
        return ans;
        
    }
    public void inorder(TreeNode node,List<Integer> list){
        if(node==null){
            return;
        }
      
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }
}