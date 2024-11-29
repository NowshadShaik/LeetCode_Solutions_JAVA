package Solutions;

import java.util.HashSet;
import java.util.Set;

public class _3217_Delete_Notes_From_Linked_List_Present_In_Array {

    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();

        for(int n: nums) set.add(n);

        ListNode temp = new ListNode();
        temp.next = head;
        ListNode prev = temp;
        while(head!=null) {
            if(set.contains(head.val)) {
                prev.next = head.next;
            } else {
                prev = head;
            }
            head = head.next;
        }

        return temp.next;
    }
}
