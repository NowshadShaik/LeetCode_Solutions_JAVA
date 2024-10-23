package J_Binary_Tree.A_Easy;

import J_Binary_Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _0637_Average_Of_Levels_In_Binary_Tree_BFS {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int l = queue.size();
            double sum = 0;
            for(int i=0;i<l;i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            res.add(sum/l);
        }
        return res;
    }
}
