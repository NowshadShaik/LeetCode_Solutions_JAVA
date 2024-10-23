package J_Binary_Tree.B_medium;

import J_Binary_Tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _0102_Binary_Tree_Level_Order_Traversal_BFS {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();

        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int l = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i<l;i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            res.add(level);
        }
        return res;
    }
}
