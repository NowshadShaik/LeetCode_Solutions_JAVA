package Solutions;

public class _1578_Minimum_Time_to_Make_Rope_Colorful {

    public int minCost(String colors, int[] neededTime) {
        int res = 0;

        int l = 0;
        int r = 1;

        while (r < colors.length()) {

            if (l != -1 && colors.charAt(l) == colors.charAt(r)) {

                if (neededTime[l] < neededTime[r])
                    res += neededTime[l--];
                else {
                    res += neededTime[r++];
                    continue;
                }
            }

            l = r;
            r++;
        }

        return res;
    }
}
