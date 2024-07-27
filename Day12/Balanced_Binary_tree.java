package Day12;

public class Balanced_Binary_tree {
    public boolean isBalanced(TreeNode root) {
        int height=work(root);
        if(height==-1)
        return false;
        else
        return true;
      }
      int work(TreeNode root){
          if(root==null)
            return 0;
          int leftheight=work(root.left);
          int rightheight=work(root.right);
          if(leftheight==-1 || rightheight==-1) return -1;
          if(Math.abs(leftheight-rightheight)>1)
           return -1;
          return Math.max(leftheight,rightheight)+1;
          
      }
}
