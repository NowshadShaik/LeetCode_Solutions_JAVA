package Solutions;

public class _0337_House_Robber_III {

    public int rob(TreeNode root) {
        int[] robbed = dfs(root);
        return Math.max(robbed[0], robbed[1]);
    }

    private int[] dfs(TreeNode node) {
        if (node == null)
            return new int[]{0, 0};

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int withRoot = node.val + left[1] + right[1];
        int withoutRoot = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int[]{withRoot, withoutRoot};
    }
}
