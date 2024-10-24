package J_Binary_Tree.B_medium;

import J_Binary_Tree.TreeNode;

public class _0951_Flip_Equivalent_BinaryTrees {

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return true;
        }

        if(root1==null || root2 == null || root1.val != root2.val) {
            return false;
        }

        return (flipEquiv(root1.left, root2.left) &&
                flipEquiv(root1.right, root2.right)) ||
                (flipEquiv(root1.left, root2.right) &&
                        flipEquiv(root1.right, root2.left));
    }
}
