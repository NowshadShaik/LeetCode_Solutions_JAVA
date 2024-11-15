package Solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _1161_Maximum_Sum_Of_A_Binary_Tree {

    class Solution {
        public int maxLevelSum(TreeNode root) {
            int res = 0;
            int currLevel = 1;
            int maxSum = Integer.MIN_VALUE;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(!queue.isEmpty()) {
                int n = queue.size();
                int currSum = 0;
                for(int i=0;i<n;i++) {
                    TreeNode node = queue.poll();
                    currSum+=node.val;
                    if(node.left!=null) queue.offer(node.left);
                    if(node.right!=null) queue.offer(node.right);
                }
                if(currSum > maxSum) {
                    maxSum = currSum;
                    res = currLevel;
                }
                currLevel++;
            }
            return res;
        }
    }
}
