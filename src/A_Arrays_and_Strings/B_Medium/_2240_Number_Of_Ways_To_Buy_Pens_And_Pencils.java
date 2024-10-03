package A_Arrays_and_Strings.B_Medium;

public class _2240_Number_Of_Ways_To_Buy_Pens_And_Pencils {

    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ans = 0;
        int count = total / cost1;
        for (int i = 0; i <= count; i++) {
            int rem = total - (cost1 * i);
            ans += rem / cost2 + 1;
        }

        return ans;
    }
}
