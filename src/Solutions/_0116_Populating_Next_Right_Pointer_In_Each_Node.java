package Solutions;

public class _0116_Populating_Next_Right_Pointer_In_Each_Node {

    public Node1 connect(Node1 root) {
        if (root == null) return root;

        Node1 leftMost = root;
        while (leftMost.left != null) {
            Node1 curr = leftMost;
            while (curr != null) {
                curr.left.next = curr.right;

                if (curr.next != null) {
                    curr.right.next = curr.next.left;
                }

                curr = curr.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }
}

class Node1 {
    public int val;
    public Node1 left;
    public Node1 right;
    public Node1 next;

    public Node1() {
    }

    public Node1(int _val) {
        val = _val;
    }

    public Node1(int _val, Node1 _left, Node1 _right, Node1 _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
