package Solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _0895_Maximum_Frequency_Stack {

    private Map<Integer, Integer> cnt;
    private Map<Integer, Stack<Integer>> stacks;
    private int maxCnt;

    public _0895_Maximum_Frequency_Stack() {
        cnt = new HashMap<>();
        stacks = new HashMap<>();
        maxCnt = 0;
    }

    public void push(int val) {
        int valCnt = cnt.getOrDefault(val, 0) + 1;
        cnt.put(val, valCnt);
        if (valCnt > maxCnt) {
            maxCnt = valCnt;
            stacks.putIfAbsent(valCnt, new Stack<>());
        }
        stacks.get(valCnt).push(val);
    }

    public int pop() {
        int res = stacks.get(maxCnt).pop();
        cnt.put(res, cnt.get(res) - 1);
        if (stacks.get(maxCnt).isEmpty())
            maxCnt--;

        return res;
    }
}
