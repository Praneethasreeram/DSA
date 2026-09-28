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
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
        {
            return list;
        }
        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        int right=0;
        while(!q.isEmpty())
        {
            List<Integer> subList=new ArrayList<>();
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
            TreeNode removed=q.poll();
            subList.add(removed.val);
        }
        
          if(right==0)
          {
          list.add(subList);
          right++;
          }
          else
          {
            Collections.reverse(subList);
            list.add(subList);
            right=0;
          }

        }

        return list;
    }
}