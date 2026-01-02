package Solutions;

import java.util.HashSet;
import java.util.Set;

public class _0961_N_Repeated_Elements_in_Size_2N_Array {

    public int repeatedNTimes(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n))
                return n;
            else
                set.add(n);
        }

        return -1;
    }
}
