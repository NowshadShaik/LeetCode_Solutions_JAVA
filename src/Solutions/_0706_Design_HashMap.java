package Solutions;

public class _0706_Design_HashMap {
    private ListNode1[] data;

    public _0706_Design_HashMap() {
        this.data = new ListNode1[1000];

        for (int i = 0; i < 1000; i++)
            data[i] = new ListNode1();
    }

    public void put(int key, int value) {
        ListNode1 curr = data[hash(key)];
        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next.val = value;
                return;
            }
            curr = curr.next;
        }
        curr.next = new ListNode1(key, value, null);
    }

    public int get(int key) {
        ListNode1 curr = data[hash(key)];
        while (curr != null) {
            if (curr.key == key) {
                return curr.val;
            }
            curr = curr.next;
        }
        return -1;
    }

    public void remove(int key) {
        ListNode1 curr = data[hash(key)];
        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }

    }

    private int hash(int key) {
        return key % data.length;
    }

}

class ListNode1 {
    int key, val;
    ListNode1 next;

    public ListNode1(int k, int v, ListNode1 n) {
        this.key = k;
        this.val = v;
        this.next = n;
    }

    public ListNode1() {
        this(-1, -1, null);
    }
}
