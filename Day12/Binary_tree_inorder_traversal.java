package Day12;

import java.util.ArrayList;
import java.util.List;

public class Binary_tree_inorder_traversal {
     public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        inorder(root, a);
        return a;

    }

    void inorder(TreeNode root, List<Integer> a) {
        if (root == null) {
            return;
        }
        inorder(root.left, a);
        a.add(root.val);
        inorder(root.right, a);

    }
}
