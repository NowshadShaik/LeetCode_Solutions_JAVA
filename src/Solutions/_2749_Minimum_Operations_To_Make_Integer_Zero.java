package Solutions;

public class _2749_Minimum_Operations_To_Make_Integer_Zero {

    public int makeTheIntegerZero(int num1, int num2) {
        int k = 1;

        while (true) {
            long x = num1 - (k * (long) num2);

            if (x < k)
                return -1;

            if (Long.bitCount(x) <= k)
                return k;

            k++;
        }

    }
}
