package Day12;

public class Minimum_Absolute_diff_in_BST {
    TreeNode prev=null;
    int min=Integer.MAX_VALUE;
    void solve(TreeNode root){
        if(root==null) return;
        solve(root.left);
        if(prev!=null) min=Math.min(min,Math.abs(prev.val-root.val));
        prev=root;
        solve(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
      solve(root);
      return min;
        
    }
}
