package Solutions;

public class _0700_Search_Binary_Tree {

    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if(root==null) return null;
            if(root.val == val) return root;
            if(root.val < val) return searchBST(root.right, val);
            else return searchBST(root.left, val);
        }
    }
}
