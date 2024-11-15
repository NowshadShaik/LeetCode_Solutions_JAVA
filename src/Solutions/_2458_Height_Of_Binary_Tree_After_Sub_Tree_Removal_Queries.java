package Solutions;

public class _2458_Height_Of_Binary_Tree_After_Sub_Tree_Removal_Queries {

    class Solution {
        static final int[] maxHeightsAfterRemoval = new int[100001];
        int currMaxHeight = 0;
        public int[] treeQueries(TreeNode root, int[] queries) {
            traverseLeftRight(root, 0);
            currMaxHeight = 0;
            traverseRightLeft(root, 0);

            for(int i=0;i<queries.length;i++) {
                queries[i] = maxHeightsAfterRemoval[queries[i]];
            }

            return queries;
        }

        private void traverseLeftRight(TreeNode node, int currHeight) {
            if(node == null) return;

            maxHeightsAfterRemoval[node.val] = currMaxHeight;
            currMaxHeight = Math.max(currMaxHeight, currHeight);

            traverseLeftRight(node.left, currHeight+1);
            traverseLeftRight(node.right, currHeight+1);
        }

        private void traverseRightLeft(TreeNode node, int currHeight) {
            if(node == null) return;

            maxHeightsAfterRemoval[node.val] = Math.max(maxHeightsAfterRemoval[node.val], currMaxHeight);
            currMaxHeight = Math.max(currMaxHeight, currHeight);

            traverseRightLeft(node.right, currHeight+1);
            traverseRightLeft(node.left, currHeight+1);
        }
    }
}
