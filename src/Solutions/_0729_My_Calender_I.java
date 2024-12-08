package Solutions;

import java.util.TreeMap;

public class _0729_My_Calender_I {

    TreeMap<Integer, Integer> calender;

    public _0729_My_Calender_I() {
        this.calender = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer prev = calender.floorKey(start),
                next = calender.ceilingKey(start);

        if ((prev == null || calender.get(prev) <= start) &&
                (next == null || end <= next)) {
            calender.put(start, end);
            return true;
        }
        return false;
    }
}
