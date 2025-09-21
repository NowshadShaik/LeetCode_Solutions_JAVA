package Solutions;

public class _3688_Bitwise_OR_of_Even_Numbers_in_an_array {

    public int evenNumberBitwiseORs(int[] nums) {
        int res = 0;
        for (int n : nums) {
            if (n % 2 == 0)
                res |= n;
        }

        return res;
    }
}
