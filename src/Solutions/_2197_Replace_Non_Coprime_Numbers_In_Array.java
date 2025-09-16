package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _2197_Replace_Non_Coprime_Numbers_In_Array {

    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int n : nums) {

            while (!list.isEmpty()) {
                int prev = list.get(list.size() - 1);
                int gcd = gcd(prev, n);
                if (gcd == 1)
                    break;

                list.remove(list.size() - 1);
                n = prev / gcd * n;
            }

            list.add(n);
        }

        return list;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}
