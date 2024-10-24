package J_Binary_Tree.A_Easy;

import J_Binary_Tree.TreeNode;

public class _0104_Max_Depth_Of_Binary_Tree {

    private int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        traverse(root, 1);
        return maxDepth;
    }

    private void traverse(TreeNode node, int depth) {
        if(node==null) return;
        maxDepth = Math.max(depth, maxDepth);
        traverse(node.left, depth+1);
        traverse(node.right, depth+1);
    }
}
