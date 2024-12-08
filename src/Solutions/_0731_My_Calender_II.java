package Solutions;

import java.util.Map;
import java.util.TreeMap;

public class _0731_My_Calender_II {

    private Map<Integer, Integer> bookingCount;
    private int maxOverLapped;

    public _0731_My_Calender_II() {
        bookingCount = new TreeMap<>();
        maxOverLapped = 2;
    }

    public boolean book(int start, int end) {
        bookingCount.put(start, bookingCount.getOrDefault(start, 0) + 1);
        bookingCount.put(end, bookingCount.getOrDefault(end, 0) - 1);

        int overLapped = 0;

        for (Map.Entry<Integer, Integer> entry : bookingCount.entrySet()) {
            overLapped += entry.getValue();

            if (overLapped > maxOverLapped) {
                bookingCount.put(start, bookingCount.get(start) - 1);
                bookingCount.put(end, bookingCount.get(end) + 1);

                if (bookingCount.get(start) == 0) {
                    bookingCount.remove(start);
                }

                return false;
            }
        }
        return true;
    }
}
