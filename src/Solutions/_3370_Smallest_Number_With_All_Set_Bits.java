package Solutions;

public class _3370_Smallest_Number_With_All_Set_Bits {

    public int smallestNumber(int n) {
        int res = 2;

        while (res <= n)
            res = res * 2;

        return res - 1;
    }
}
