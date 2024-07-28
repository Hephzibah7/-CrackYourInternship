package Day13;

import java.util.ArrayList;
import java.util.List;

public class Binary_tree_right_side_view {
     public List<Integer> rightSideView(TreeNode root) {
       List<Integer> list=new ArrayList<>();
       int level=0;
       calc(root,list,level);
       return list;
    }
    void calc(TreeNode root,List<Integer> list, int level){
        if(root==null)  return;
        if(list.size()==level) list.add(root.val);
        calc(root.right, list, level+1);
        calc(root.left, list, level+1);
    }
}
