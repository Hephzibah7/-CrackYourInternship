package Day11;

public class Symmetric_tree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        return true;
        return ischeck(root.left, root.right);
    }
    boolean ischeck(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null)
        return true;
        if(root1==null && root2!=null)
        return false;
        if(root1!=null && root2==null)
        return false;
        boolean left=ischeck(root1.left, root2.right);
        boolean right=ischeck(root1.right, root2.left);
        return (root1.val==root2.val) && left && right;
    }
}
