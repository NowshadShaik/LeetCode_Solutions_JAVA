package Solutions;

public class _3598_Smallest_Missing_Non_Negative_Integer_After_Operations {

    public int findSmallestInteger(int[] nums, int value) {
        int[] rems = new int[value];

        for (int n : nums) {
            int r = ((n % value) + value) % value;
            rems[r]++;
        }

        int res = 0;
        while (rems[res % value] > 0) {
            rems[res % value]--;
            res++;
        }

        return res;
    }
}
