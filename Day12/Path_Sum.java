package Day12;

public class Path_Sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        return false;
        if(root.val==targetSum && root.right==null && root.left==null) return true;
        boolean leftnode=hasPathSum(root.left, targetSum-root.val);
        boolean  rightnode=hasPathSum(root.right, targetSum-root.val);
        return leftnode || rightnode;
    }
}
