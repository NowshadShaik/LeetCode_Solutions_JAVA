package Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0133_Clone_Graph {

    public Node3 cloneGraph(Node3 node) {
        Map<Node3, Node3> oldToNew = new HashMap<>();

        return clone(node, oldToNew);
    }

    private Node3 clone(Node3 node, Map<Node3, Node3> oldToNew) {
        if (node == null)
            return null;

        if (oldToNew.containsKey(node))
            return oldToNew.get(node);

        Node3 clone = new Node3(node.val);
        oldToNew.put(node, clone);

        for (Node3 n : node.neighbors)
            clone.neighbors.add(clone(n, oldToNew));

        return clone;
    }
}

class Node3 {
    public int val;
    public List<Node3> neighbors;
    public Node3() {
        val = 0;
        neighbors = new ArrayList<Node3>();
    }
    public Node3(int _val) {
        val = _val;
        neighbors = new ArrayList<Node3>();
    }
    public Node3(int _val, ArrayList<Node3> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
