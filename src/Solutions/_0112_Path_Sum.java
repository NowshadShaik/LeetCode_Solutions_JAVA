package Solutions;

public class _0112_Path_Sum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return traverse(root, 0, targetSum);
    }

    private boolean traverse(TreeNode node, int sum, int target) {
        if(node==null) return false;
        sum += node.val;
        if(node.left==null && node.right==null && sum == target) return true;
        return traverse(node.left, sum, target) || traverse(node.right, sum, target);
    }
}
