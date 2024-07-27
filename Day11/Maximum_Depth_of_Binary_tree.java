package Day11;

public class Maximum_Depth_of_Binary_tree {
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        int lefth=maxDepth(root.left);
        int righth=maxDepth(root.right);
        return 1+Math.max(lefth,righth);
    }
}
