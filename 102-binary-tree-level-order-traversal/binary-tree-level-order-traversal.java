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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new ArrayDeque<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root!=null)
        {
        q.offer(root);
        
        while(!q.isEmpty())
        {
            List<Integer> sub=new ArrayList<>();
            int size=q.size();
            for(int i=1;i<=size;i++)
            {
                if(q.peek().left!=null)
                {
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null)
                {
                    q.offer(q.peek().right);
                }
               TreeNode removed= q.poll();
               sub.add(removed.val);


            }
            res.add(sub);

        }
        }
        
        return res;
        

        
    }
}