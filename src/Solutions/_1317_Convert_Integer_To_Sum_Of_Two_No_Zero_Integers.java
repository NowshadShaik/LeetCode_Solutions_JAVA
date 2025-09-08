package Solutions;

public class _1317_Convert_Integer_To_Sum_Of_Two_No_Zero_Integers {

    public int[] getNoZeroIntegers(int n) {

        for (int i = 1; i <= n / 2; i++) {
            int a = i;
            int b = n - i;

            if (isNonZero(a) && isNonZero(b))
                return new int[]{a, b};
        }

        return new int[2];
    }

    private boolean isNonZero(int a) {
        while (a > 0) {
            if (a % 10 == 0)
                return false;

            a = a / 10;
        }
        return true;
    }
}
