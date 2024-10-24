package J_Binary_Tree.B_medium;

import J_Binary_Tree.TreeNode;

public class _1448_Count_Good_Nodes_In_Binary_Tree {

    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        int[] res = new int[1];
        traverse(root, Integer.MIN_VALUE, res);
        return res[0];
    }

    private void traverse(TreeNode node,  int max, int[] res) {
        if(node == null) return;
        if(node.val>=max) {
            max = node.val;
            res[0]++;
        }
        traverse(node.left, max, res);
        traverse(node.right, max, res);
    }
}
