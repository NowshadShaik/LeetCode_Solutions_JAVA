package Solutions;

import java.util.*;

public class _2471_Minimum_Number_Of_Operations_To_Sort_A_Binary_Tree_By_Level {

    public int minimumOperations(TreeNode root) {
        int res = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int[] values = new int[size];

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                values[i] = node.val;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            res += getMinSwaps(values);
        }

        return res;
    }

    private int getMinSwaps(int[] values) {
        int swaps = 0;
        int[] target = values.clone();
        Arrays.sort(target);

        Map<Integer, Integer> posMap = new HashMap<>();
        for (int i = 0; i < values.length; i++)
            posMap.put(values[i], i);

        for (int i = 0; i < values.length; i++) {
            if (values[i] != target[i]) {
                swaps++;

                int currPos = posMap.get(target[i]);
                posMap.put(values[i], currPos);
                values[currPos] = values[i];
            }
        }

        return swaps;
    }
}
