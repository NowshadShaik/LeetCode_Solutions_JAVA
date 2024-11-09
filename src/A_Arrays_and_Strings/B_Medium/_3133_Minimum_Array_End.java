package A_Arrays_and_Strings.B_Medium;

public class _3133_Minimum_Array_End {
    public long minEnd(int n, int x) {
        long res = x;
        for (int i = 1; i < n; i++) {
            res = (res + 1) | x;
        }
        return res;
    }
}
