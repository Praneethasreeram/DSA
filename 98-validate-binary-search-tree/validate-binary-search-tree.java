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
    List<Integer> list=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
    inorder(root);
    int max=list.get(0);
    boolean res=true;
    for(int i=1;i<list.size();i++)
    {
        if(max>list.get(i))
        {
            res=false;
            break;
        }
        else if(max<list.get(i))
        {
            max=list.get(i);
        }
        else
        {
            res=false;
            break;
        }
        
        

        
    }        


            return res;

    }
    public void inorder(TreeNode root)
    {
        if(root!=null)
        {
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);

        }
        
    }
}