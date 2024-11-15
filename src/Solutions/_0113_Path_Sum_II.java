package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0113_Path_Sum_II {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();

        traverse(root, 0, targetSum, list);
        return res;

    }

    private void traverse(TreeNode node, int currSum, int targetSum, List<Integer> list) {
        if(node==null) return;
        currSum+=node.val;
        list.add(node.val);
        if(currSum == targetSum && node.left==null && node.right==null) {
            res.add(new ArrayList<>(list));
        }
        traverse(node.left, currSum, targetSum, list);
        traverse(node.right, currSum, targetSum, list);
        list.remove(list.size()-1);
    }
}
