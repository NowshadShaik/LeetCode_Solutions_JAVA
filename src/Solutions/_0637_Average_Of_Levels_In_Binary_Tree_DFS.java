package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0637_Average_Of_Levels_In_Binary_Tree_DFS {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> sum = new ArrayList();
        List<Integer> count = new ArrayList();
        DFS(root, sum, count, 0);

        List<Double> res = new ArrayList<>();
        for(int i=0;i<sum.size();i++) {
            res.add(sum.get(i)/count.get(i));
        }
        return res;
    }

    private void DFS(TreeNode node, List<Double> sum, List<Integer> count, int depth) {
        if(node==null) return;
        if(depth==sum.size()) {
            sum.add(0.0);
            count.add(0);
        }

        sum.set(depth, sum.get(depth) + node.val);
        count.set(depth, count.get(depth) + 1);

        DFS(node.left, sum, count, depth+1);
        DFS(node.right, sum, count, depth+1);
    }
}
