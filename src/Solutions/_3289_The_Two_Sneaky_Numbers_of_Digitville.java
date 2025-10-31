package Solutions;

import java.util.HashSet;
import java.util.Set;

public class _3289_The_Two_Sneaky_Numbers_of_Digitville {

    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2];
        int r = 0;
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (!set.add(n)) {
                res[r] = n;
                r++;
            }
        }

        return res;
    }
}
