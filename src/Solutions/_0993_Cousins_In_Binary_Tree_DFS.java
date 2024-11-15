package Solutions;

public class _0993_Cousins_In_Binary_Tree_DFS {

    int[][] values = new int[2][2];
    public boolean isCousins(TreeNode root, int x, int y) {
        DFS(root, x, y, 0, new TreeNode(-1));
        return (values[0][0] == values[1][0]) && values[0][1] != values[1][1];
    }

    private void DFS(TreeNode node, int x, int y, int depth, TreeNode parent) {
        if(node==null) return;
        if(node.val==x) {
            values[0][0] = depth;
            values[0][1] = parent.val;
        }
        if(node.val==y) {
            values[1][0] = depth;
            values[1][1] = parent.val;
        }

        DFS(node.left, x, y, depth+1, node);
        DFS(node.right, x, y, depth+1, node);
    }
}
