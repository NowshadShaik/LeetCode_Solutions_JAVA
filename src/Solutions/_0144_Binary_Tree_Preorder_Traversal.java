package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0144_Binary_Tree_Preorder_Traversal {
    List<Integer> res;

    public List<Integer> preorderTraversal(TreeNode root) {
        this.res = new ArrayList<>();
        preorder(root);
        return res;
    }

    private void preorder(TreeNode node) {
        if (node == null) return;

        res.add(node.val);
        preorder(node.left);
        preorder(node.right);
    }
}
