package Solutions;

import java.util.PriorityQueue;

public class _0023_Merge_K_Sorted_Lists {

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode res = new ListNode(0);
        ListNode temp = res;

        for (ListNode node : lists) {
            if (node != null)
                pq.offer(node);
        }

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            res.next = node;

            if (node.next != null)
                pq.offer(node.next);

            res = res.next;
        }

        return temp.next;
    }
}
