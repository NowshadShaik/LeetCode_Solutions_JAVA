package Solutions;

import java.util.*;

public class _0107_Binary_Tree_level_Order_Traversal_II_BFS {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null) return new ArrayList<>();

        Stack<List<Integer>> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int l = queue.size();
            List<Integer> list = new ArrayList<>();

            for(int i=0;i<l;i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            stack.push(list);
        }

        List<List<Integer>> res = new ArrayList<>();
        while(!stack.isEmpty()) {
            res.add(stack.pop());
        }

        return res;
    }
}
