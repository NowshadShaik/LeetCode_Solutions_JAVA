package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0077_Combinations {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtrack(n, 1, k, new ArrayList<>());
        return res;
    }

    private void backtrack(int n, int curr, int k, List<Integer> path) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = curr; i <= n; i++) {
            path.add(i);
            backtrack(n, i + 1, k, path);
            path.remove(path.size() - 1);
        }
    }
}
