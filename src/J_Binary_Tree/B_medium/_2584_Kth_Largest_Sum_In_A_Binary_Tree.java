package J_Binary_Tree.B_medium;


import J_Binary_Tree.TreeNode;

import java.util.Arrays;

public class _2584_Kth_Largest_Sum_In_A_Binary_Tree {
    int levelMax = 0;
    private static final long[] levelSum = new long[1000001];

    public long kthLargestLevelSum(TreeNode root, int k) {
        traverse(root, 0);
        Arrays.sort(levelSum, 0, levelMax);
        return ((k>levelMax) ? -1 : levelSum[levelMax - k]);
    }

    private void traverse(TreeNode node, int level) {
        if(node == null) return;

        if(level >= levelMax)
            levelSum[levelMax++] = node.val;
        else
            levelSum[level] += node.val;

        traverse(node.left, level + 1);
        traverse(node.right, level +1);
    }
}
