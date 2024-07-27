package Day12;

public class Sum_of_left_leaves {
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
          work(root,false);
          return sum;
    }
    void work(TreeNode root, boolean flag){
        if(root==null)
        return ;
        if(root.right==null && root.left==null && flag )
        sum=sum+root.val;
        work(root.left,true);
        work(root.right,false);
    }
}
