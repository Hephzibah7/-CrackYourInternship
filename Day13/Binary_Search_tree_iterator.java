package Day13;

import java.util.Stack;

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

public class Binary_Search_tree_iterator {
    Stack<TreeNode> stack=new Stack<>();
    
    
    public int next() {
        TreeNode node=stack.pop();
        if(node.right!=null) pushAll(node.right);
        return node.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    public void pushAll(TreeNode root){
        while(root!=null){
            stack.push(root);
            root=root.left;
        }
    }
}

