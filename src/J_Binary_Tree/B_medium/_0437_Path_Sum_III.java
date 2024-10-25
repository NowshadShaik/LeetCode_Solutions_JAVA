package J_Binary_Tree.B_medium;

import J_Binary_Tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class _0437_Path_Sum_III {

    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> map = new HashMap<>();
        map.put(0l, 1);
        return helper(root, targetSum, 0, map);
    }

    private int helper(TreeNode node, int targetSum, long preSum, Map<Long, Integer> map) {
        if(node == null) return 0;

        preSum+=node.val;
        int res = map.getOrDefault(preSum-targetSum, 0);
        map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        res += helper(node.left, targetSum, preSum, map) + helper(node.right, targetSum, preSum, map);
        map.put(preSum, map.get(preSum) - 1);
        return res;
    }
}
