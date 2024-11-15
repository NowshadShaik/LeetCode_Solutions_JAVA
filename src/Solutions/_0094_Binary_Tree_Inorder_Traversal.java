package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0094_Binary_Tree_Inorder_Traversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traverse(root, res);
        return res;
    }

    private void traverse(TreeNode node, List<Integer> res) {
        if(node==null) return;

        traverse(node.left, res);
        res.add(node.val);
        traverse(node.right, res);
    }
}
