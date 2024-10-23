package J_Binary_Tree.B_medium;

import J_Binary_Tree.TreeNode;

public class _2461_Cousins_In_Binary_Tree_II {

    public TreeNode replaceValueInTree(TreeNode root) {
        int[] levels = new int[100000];

        traverse(root, levels, 0);
        traverseUpdate(root, levels, 0);

        return root;
    }

    private void traverse(TreeNode node, int[] levels, int depth) {
        if(node==null) return;
        levels[depth] += node.val;
        traverse(node.left, levels, depth+1);
        traverse(node.right, levels, depth+1);
    }

    private void traverseUpdate(TreeNode node, int[] levels, int depth) {
        if(node==null) return;
        if(depth==0) node.val = levels[depth] - node.val;

        int sum = 0;

        if(node.left!=null) sum+=node.left.val;
        if(node.right!=null) sum+=node.right.val;

        if(node.left!=null) node.left.val = levels[depth+1] - sum;
        if(node.right!=null) node.right.val = levels[depth+1] - sum;

        traverseUpdate(node.left, levels, depth+1);
        traverseUpdate(node.right, levels, depth+1);
    }
}
