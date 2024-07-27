package Day11;

public class Subtree_of_binary_tree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(work(root,subRoot))
        return true;
       isSubtree(root.left,subRoot);
       isSubtree(root.right,subRoot);
       return false;
    }
    boolean work(TreeNode root, TreeNode subRoot){
        if((root.val==subRoot.val)&&(root.left.val==subRoot.left.val)&&(root.right.val==subRoot.right.val))
        return true;
        else
        return false;
    }
}
