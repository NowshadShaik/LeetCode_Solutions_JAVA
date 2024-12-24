package Solutions;

public class _0124_Binary_Tree_Maximum_Sum_Path {

    private int res;

    public int maxPathSum(TreeNode root) {
        this.res = root.val;
        dfs(root);
        return res;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        int leftMax = Math.max(0, dfs(node.left));
        int rightMax = Math.max(0, dfs(node.right));

        res = Math.max(res, node.val + leftMax + rightMax);
        return node.val + Math.max(leftMax, rightMax);
    }
}
