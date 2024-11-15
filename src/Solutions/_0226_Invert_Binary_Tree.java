package Solutions;

public class _0226_Invert_Binary_Tree {

    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode node) {
        if(node == null) return;

        invert(node.left);
        invert(node.right);

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
