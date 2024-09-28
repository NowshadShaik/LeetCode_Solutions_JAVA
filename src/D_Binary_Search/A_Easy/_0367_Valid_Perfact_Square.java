package D_Binary_Search.A_Easy;

public class _0367_Valid_Perfact_Square {

    public boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;
        if (num < 0)
            return false;

        int l = 0, r = num / 2;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if ((long) m * m == num)
                return true;
            else if ((long) m * m > num)
                r = m - 1;
            else
                l = m + 1;
        }
        return false;
    }
}
