package J_Binary_Tree.B_medium;

import J_Binary_Tree.TreeNode;

public class _0105_Construct_Binary_Tree_From_PreOrder_And_InOrder_Traversal {

    int preIdx = 0;
    int inIdx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return dfs(preorder, inorder, Integer.MAX_VALUE);
    }

    private TreeNode dfs(int[] preorder, int[] inorder, int limit) {
        if(preIdx >= preorder.length) return null;
        if(inorder[inIdx] == limit) {
            inIdx++;
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIdx++]);
        root.left = dfs(preorder, inorder, root.val);
        root.right = dfs(preorder, inorder, limit);
        return root;
    }
}
