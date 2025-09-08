package Solutions;

public class _0111_Minimum_Depth_Of_Binary_Tree {

    private int res;

    public int minDepth(TreeNode root) {
        res = 0;
        if (root == null)
            return res;

        traverse(root, 1);

        return res;
    }

    private void traverse(TreeNode node, int depth) {
        if (node.left == null && node.right == null) {
            if (res == 0)
                res = depth;
            else
                res = Math.min(res, depth);
        }

        if (node.left != null)
            traverse(node.left, depth + 1);
        if (node.right != null)
            traverse(node.right, depth + 1);
    }
}
