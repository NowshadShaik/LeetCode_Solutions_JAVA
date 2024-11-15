package J_Binary_Tree.A_Easy;

import J_Binary_Tree.TreeNode;

public class _0543_Diameter_Of_Binary_Tree {

    private int res;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        diameter(root);
        return res;
    }

    private int diameter(TreeNode node) {
        if(node == null) return 0;

        int l = diameter(node.left);
        int r = diameter(node.right);

        res = Math.max(res, l+r);
        return Math.max(l,r)+1;
    }
}
