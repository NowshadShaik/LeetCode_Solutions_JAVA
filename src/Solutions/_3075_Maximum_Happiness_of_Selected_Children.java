package Solutions;

import java.util.Arrays;

public class _3075_Maximum_Happiness_of_Selected_Children {

    public long maximumHappinessSum(int[] happiness, int k) {

        Arrays.sort(happiness);
        long res = 0;
        int turn = 0;

        for(int i=happiness.length-1;i>=0;i--) {

            int sub = Math.max(happiness[i] - turn, 0);
            res += sub;

            turn++;
            if(turn == k)
                break;
        }

        return res;
    }
}
