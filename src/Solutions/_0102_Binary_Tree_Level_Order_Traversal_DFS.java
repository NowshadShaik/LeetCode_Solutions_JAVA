package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0102_Binary_Tree_Level_Order_Traversal_DFS {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traverse(root, 0, res);
        return res;
    }

    private void traverse(TreeNode node, int depth, List<List<Integer>> res) {
        if(node==null) return;
        if(res.size()==depth) res.add(new ArrayList<>());
        res.get(depth).add(node.val);
        traverse(node.left, depth+1, res);
        traverse(node.right, depth+1, res);
    }
}
