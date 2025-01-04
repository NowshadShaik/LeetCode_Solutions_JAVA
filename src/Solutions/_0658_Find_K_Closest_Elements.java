package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0658_Find_K_Closest_Elements {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - 1;
        while (r - l >= k) {
            if (Math.abs(x - arr[l]) <= Math.abs(x - arr[r]))
                r--;
            else
                l++;
        }

        List<Integer> res = new ArrayList<>();
        while (l <= r) {
            res.add(arr[l++]);
        }
        return res;
    }
}
