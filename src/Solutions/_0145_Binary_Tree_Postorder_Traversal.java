package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0145_Binary_Tree_Postorder_Traversal {

    List<Integer> res;

    public List<Integer> postorderTraversal(TreeNode root) {
        res = new ArrayList<>();
        postorder(root);
        return res;
    }

    private void postorder(TreeNode node) {
        if (node == null) return;

        postorder(node.left);
        postorder(node.right);
        res.add(node.val);
    }
}
