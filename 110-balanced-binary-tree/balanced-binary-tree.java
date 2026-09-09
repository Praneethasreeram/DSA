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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        int l=heigth(root.left);
        int r=heigth(root.right);
        if(Math.abs(l-r)>1)
        {
            return false;
        }
        boolean lb=isBalanced(root.left);
        boolean rb=isBalanced(root.right);
        if(lb && rb)
        {
            return true;
        }
        else
        {
            return false;
        }

        
    }
    public int heigth(TreeNode root)
    {
        if(root==null)
            return 0;
        int l=heigth(root.left);
        int r=heigth(root.right);
        return 1+Math.max(l,r);
    }
}