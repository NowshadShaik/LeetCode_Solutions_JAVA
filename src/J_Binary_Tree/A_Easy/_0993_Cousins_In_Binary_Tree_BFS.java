package J_Binary_Tree.A_Easy;

import J_Binary_Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _0993_Cousins_In_Binary_Tree_BFS {

    public boolean isCousins(TreeNode root, int x, int y) {
        return BFS(root, x, y);
    }

    private boolean BFS(TreeNode root, int x, int y) {
        Queue<Pair<TreeNode, TreeNode>> queue = new LinkedList<>();
        queue.add(new Pair(root, null));

        while(!queue.isEmpty()) {
            int l = queue.size();
            List<TreeNode> list = new ArrayList<>();
            for(int i=0;i<l;i++) {
                Pair<TreeNode, TreeNode> pair = queue.poll();
                TreeNode currNode = pair.getKey();
                TreeNode parent = pair.getValue();
                if(currNode.val == x || currNode.val == y) {
                    if(parent!=null) list.add(parent);
                }
                if(currNode.left!=null) queue.add(new Pair(currNode.left, currNode));
                if(currNode.right!=null) queue.add(new Pair(currNode.right, currNode));
            }
            if(list.size() == 2 && list.get(0)!=list.get(1)) return true;
        }
        return false;
    }
}
