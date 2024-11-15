package Solutions;

import java.util.HashMap;
import java.util.Map;

public class _0138_Copy_List_With_Random_Pointer {

    public Node2 copyRandomList(Node2 head) {
        Map<Node2, Node2> map = new HashMap<>();
        Node2 curr = head;
        while(curr!=null) {
            map.put(curr, new Node2(curr.val));
            curr = curr.next;
        }
        curr = head;
        while(curr!=null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}

class Node2 {
    int val;
    Node2 next;
    Node2 random;

    public Node2(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}