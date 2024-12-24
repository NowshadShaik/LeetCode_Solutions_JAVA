package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0297_Serialize_And_Deserialize_Binary_Tree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> serialized = new ArrayList<>();
        dfsSerialize(root, serialized);
        return String.join(",", serialized);
    }

    private void dfsSerialize(TreeNode node, List<String> serialized) {
        if (node == null) {
            serialized.add("N");
            return;
        }

        serialized.add(String.valueOf(node.val));
        dfsSerialize(node.left, serialized);
        dfsSerialize(node.right, serialized);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] vals = data.split(",");
        int[] i = new int[1];
        return dfsDeserialize(vals, i);
    }

    private TreeNode dfsDeserialize(String[] vals, int[] i) {
        if (vals[i[0]].equals("N")) {
            i[0]++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.valueOf(vals[i[0]]));
        i[0]++;
        root.left = dfsDeserialize(vals, i);
        root.right = dfsDeserialize(vals, i);

        return root;
    }
}
