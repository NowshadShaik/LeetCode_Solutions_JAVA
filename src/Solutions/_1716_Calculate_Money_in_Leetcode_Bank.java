package Solutions;

public class _1716_Calculate_Money_in_Leetcode_Bank {

    public int totalMoney(int n) {
        int res = 0;
        int monday = 1;

        while (n > 0) {
            for (int i = 0; i < Math.min(n, 7); i++)
                res += monday + i;

            n -= 7;
            monday++;
        }

        return res;
    }
}
