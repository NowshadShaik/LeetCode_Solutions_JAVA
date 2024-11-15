package J_Binary_Tree.B_medium;

import J_Binary_Tree.TreeNode;

public class _0230_Kth_Smallest_Element_In_A_BST {

    int i;
    int pos;
    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return pos;
    }

    private void traverse(TreeNode node, int k) {
        if(node == null) return;

        traverse(node.left, k);
        i++;
        if(i == k) {
            pos = node.val;
            return;
        }
        traverse(node.right, k);
    }
}
