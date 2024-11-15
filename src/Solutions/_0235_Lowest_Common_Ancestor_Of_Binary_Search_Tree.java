package Solutions;

public class _0235_Lowest_Common_Ancestor_Of_Binary_Search_Tree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;

        while(curr != null) {
            if(p.val > curr.val && q.val > curr.val) {
                curr = curr.right;
            } else if(p.val < curr.val && q.val < curr.val) {
                curr = curr.left;
            } else {
                return curr;
            }
        }
        return null;
    }
}
