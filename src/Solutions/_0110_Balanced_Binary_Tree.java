package Solutions;

public class _0110_Balanced_Binary_Tree {

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        return maxHeight(root) != -1;
    }

    private int maxHeight(TreeNode node) {
        if(node == null) return 0;

        int l = maxHeight(node.left);
        int r = maxHeight(node.right);

        if(l == -1 || r == -1) return -1;
        if(Math.abs(l - r) > 1) return -1;

        return Math.max(l, r) + 1;
    }
}
