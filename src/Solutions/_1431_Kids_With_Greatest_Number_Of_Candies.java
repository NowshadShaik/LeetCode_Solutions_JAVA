package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _1431_Kids_With_Greatest_Number_Of_Candies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++)
            max = Math.max(max, candies[i]);

        for (int i = 0; i < candies.length; i++)
            res.add(candies[i] + extraCandies >= max ? true : false);

        return res;
    }
}
