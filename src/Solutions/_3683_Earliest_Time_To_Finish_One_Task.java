package Solutions;

public class _3683_Earliest_Time_To_Finish_One_Task {

    public int earliestTime(int[][] tasks) {
        int res = Integer.MAX_VALUE;

        for (int[] task : tasks) {
            int currEnd = task[0] + task[1];
            res = Math.min(res, currEnd);
        }

        return res;
    }
}
