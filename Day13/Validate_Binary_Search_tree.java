package Day13;

public class Validate_Binary_Search_tree {
    TreeNode prev=null;
    boolean flag=true;
    public boolean isValidBST(TreeNode root) {
        solve(root);
        return flag;
    }
    void solve(TreeNode root){
        if(root==null) return;
        solve(root.left);
        if(prev!=null){
            if(root.val<=prev.val) flag=false;
        }
        prev=root;
        solve(root.right);
    }
}
