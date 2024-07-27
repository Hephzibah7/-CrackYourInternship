package Day11;

public class Range_Sum_of_BST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int x=0;
        int val=sum(root,low,high,x);
        return val;
    }
    int sum(TreeNode root, int low, int high, int x){
        if (root == null){
            return 0;
        }
        x=(root.val >= low && root.val <= high) ? root.val:0;
        int leftsum=sum(root.left, low, high, x);
        int rightsum=sum(root.right, low, high, x);
        return leftsum+rightsum+x;
    }
}
