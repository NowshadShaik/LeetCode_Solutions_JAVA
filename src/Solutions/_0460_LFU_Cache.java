package Solutions;

import java.util.HashMap;
import java.util.Map;

class ListNode2 {
    int val;
    ListNode2 prev, next;

    ListNode2(int val) {
        this.val = val;
    }

    ListNode2(int val, ListNode2 prev, ListNode2 next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}

class DoublyLinkedList {
    private ListNode2 left, right;
    private Map<Integer, ListNode2> map;

    DoublyLinkedList() {
        this.left = new ListNode2(0);
        this.right = new ListNode2(0, this.left, null);
        this.left.next = this.right;
        this.map = new HashMap<>();
    }

    public int length() {
        return map.size();
    }

    public void pushRight(int val) {
        ListNode2 node = new ListNode2(val, this.right.prev, this.right);
        this.map.put(val, node);
        this.right.prev.next = node;
        this.right.prev = node;
    }

    public void pop(int val) {
        if(this.map.containsKey(val)) {
            ListNode2 node = this.map.get(val);
            ListNode2 prev = node.prev, next = node.next;
            prev.next = next;
            next.prev = prev;
            this.map.remove(val);
        }
    }

    public int popLeft() {
        int res = this.left.next.val;
        pop(res);
        return res;
    }

    public void update(int val) {
        pop(val);
        pushRight(val);
    }
}

class LFUCache {
    private int capacity;
    private int lfuCount;
    private Map<Integer, Integer> valMap;
    private Map<Integer, Integer> countMap;
    private Map<Integer, DoublyLinkedList> listMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.lfuCount = 0;
        this.valMap = new HashMap<>();
        this.countMap = new HashMap<>();
        this.listMap = new HashMap<>();
    }

    public void counter(int key) {
        int count = countMap.get(key);
        countMap.put(key, count+1);
        listMap.putIfAbsent(count, new DoublyLinkedList());
        listMap.get(count).pop(key);

        listMap.putIfAbsent(count + 1, new DoublyLinkedList());
        listMap.get(count + 1).pushRight(key);

        if(count == lfuCount && listMap.get(count).length() == 0)
            lfuCount++;
    }

    public int get(int key) {
        if(!valMap.containsKey(key))
            return -1;

        counter(key);
        return valMap.get(key);
    }

    public void put(int key, int value) {
        if(capacity == 0)
            return;

        if(!valMap.containsKey(key) && valMap.size() == capacity) {
            int toRemove = listMap.get(lfuCount).popLeft();
            valMap.remove(toRemove);
            countMap.remove(toRemove);
        }

        valMap.put(key, value);
        countMap.putIfAbsent(key, 0);
        counter(key);
        lfuCount = Math.min(lfuCount, countMap.get(key));
    }
}
