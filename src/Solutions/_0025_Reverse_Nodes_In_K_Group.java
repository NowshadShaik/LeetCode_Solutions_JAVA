package Solutions;

public class _0025_Reverse_Nodes_In_K_Group {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode groupPrev = dummy;

        while (true) {
            ListNode kthNode = getKth(groupPrev, k);

            if (kthNode == null)
                break;

            ListNode groupNext = kthNode.next;

            ListNode prev = kthNode.next;
            ListNode curr = groupPrev.next;

            while (curr != groupNext) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            ListNode tmp = groupPrev.next;
            groupPrev.next = kthNode;
            groupPrev = tmp;
        }
        return dummy.next;
    }

    private ListNode getKth(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}
