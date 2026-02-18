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
    public static int MinDepth(TreeNode root,int ans){
        if(root == null) return 0;
        if(root.left == null) return 1 + MinDepth(root.right,ans);
        if(root.right == null) return 1 + MinDepth(root.left,ans);
        return 1 + Math.min(MinDepth(root.left,ans),MinDepth(root.right,ans));
    }
    public int minDepth(TreeNode root) {
        int ans = 0;
        return MinDepth(root,ans);
    }
}