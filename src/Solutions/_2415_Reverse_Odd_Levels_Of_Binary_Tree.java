package Solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _2415_Reverse_Odd_Levels_Of_Binary_Tree {

    public TreeNode reverseOddLevels(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            List<TreeNode> currLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                currLevel.add(node);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            if (level % 2 != 0) {
                int l = 0, r = size - 1;

                while (l < r) {
                    int temp = currLevel.get(l).val;
                    currLevel.get(l).val = currLevel.get(r).val;
                    currLevel.get(r).val = temp;

                    l++;
                    r--;
                }
            }

            level++;
        }

        return root;
    }
}
