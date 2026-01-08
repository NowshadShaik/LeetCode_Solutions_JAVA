package Solutions;

public class _1339_Maximum_Product_of_Splitted_Binary_Tree {

    long res = Integer.MIN_VALUE;

    public int maxProduct(TreeNode root) {
        long total = totalSum(root);

        dfs(root, total);
        return (int) (res % 1000000007);
    }

    private long dfs(TreeNode node, long total) {
        if (node == null)
            return 0;

        long leftSum = dfs(node.left, total);
        long rightSum = dfs(node.right, total);

        res = Math.max((total - leftSum) * leftSum, res);
        res = Math.max((total - rightSum) * rightSum, res);

        return leftSum + rightSum + node.val;

    }

    private long totalSum(TreeNode node) {
        if (node == null)
            return 0;

        return node.val + totalSum(node.left) + totalSum(node.right);
    }
}
