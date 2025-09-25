package Solutions;

import java.util.List;

public class _0120_Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {

        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j <= i; j++) {

                int curr = triangle.get(i).get(j);
                if (j == 0)
                    curr += triangle.get(i - 1).get(j);
                else if (j == i)
                    curr += triangle.get(i - 1).get(j - 1);
                else
                    curr += Math.min(triangle.get(i - 1).get(j - 1), triangle.get(i - 1).get(j));

                triangle.get(i).set(j, curr);
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i : triangle.get(triangle.size() - 1)) {
            res = Math.min(res, i);
        }

        return res;
    }
}
