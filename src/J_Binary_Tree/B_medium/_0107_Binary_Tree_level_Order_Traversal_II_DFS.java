package J_Binary_Tree.B_medium;

import J_Binary_Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _0107_Binary_Tree_level_Order_Traversal_II_DFS {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traverse(root, 0, res);
        return res.reversed();
    }

    private void traverse(TreeNode node, int depth, List<List<Integer>> res) {
        if(node == null) return;
        if(depth == res.size()) res.add(new ArrayList<>());
        res.get(depth).add(node.val);
        traverse(node.left, depth+1, res);
        traverse(node.right, depth+1, res);
    }
}
