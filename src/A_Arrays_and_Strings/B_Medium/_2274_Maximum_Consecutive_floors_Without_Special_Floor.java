package A_Arrays_and_Strings.B_Medium;

import java.util.Arrays;

public class _2274_Maximum_Consecutive_floors_Without_Special_Floor {

    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int max = special[0] - bottom;
        for(int i=1;i<special.length;i++) {
            max = Math.max(max,(special[i] - special[i-1])-1);
        }
        return Math.max(max, top - special[special.length-1]);
    }
}
