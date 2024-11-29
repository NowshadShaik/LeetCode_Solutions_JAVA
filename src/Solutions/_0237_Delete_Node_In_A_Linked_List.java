package Solutions;

public class _0237_Delete_Node_In_A_Linked_List {

    public void deleteNode(ListNode node) {
        ListNode prev = new ListNode();
        prev.next = node;

        while (node.next != null) {
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }

        prev.next = null;
    }
}
