package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0515_Find_Largest_Value_In_Each_Tree_Row {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }

    private void dfs(TreeNode node, List<Integer> res, int height) {
        if (node == null) return;

        if (height == res.size())
            res.add(node.val);
        else
            res.set(height, Math.max(node.val, res.get(height)));

        dfs(node.left, res, height + 1);
        dfs(node.right, res, height + 1);
    }
}
