package J_Binary_Tree.B_medium;

import J_Binary_Tree.TreeNode;

public class _0098_Validate_Binary_Search_Tree {

    public boolean isValidBST(TreeNode root) {
        return traverse(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean traverse(TreeNode node, long min, long max) {
        if(node==null) return true;

        if(node.val<=min || node.val>=max) return false;
        return traverse(node.left, min, node.val) && traverse(node.right, node.val, max);
    }
}
