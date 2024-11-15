package J_Binary_Tree.A_Easy;

import J_Binary_Tree.TreeNode;

public class _0572_Subtree_Of_Another_Tree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;

        if(root.val == subRoot.val) {
            if(sameTree(root, subRoot)) return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean sameTree(TreeNode a, TreeNode b) {
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;

        if(a.val != b.val) return false;
        return sameTree(a.left, b.left) && sameTree(a.right, b.right);
    }
}
