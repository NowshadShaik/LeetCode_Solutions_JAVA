package Solutions;

import java.util.*;

public class _0103_Binary_Tree_Zig_Zag_Level_Order_Traversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 1;

        while(!queue.isEmpty()) {
            int s = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<s;i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            if(level%2 ==0) Collections.reverse(list);
            res.add(list);
            level++;
        }
        return res;
    }
}
