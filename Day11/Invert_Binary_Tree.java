package Day11;
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Invert_Binary_Tree {
     public TreeNode invertTree(TreeNode root) {
        if(root==null)
        return root;
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        TreeNode temp=left;
        root.left=right;
        root.right=temp;
        return root;
    }
}
