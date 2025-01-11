package Solutions;

import java.util.Arrays;

public class _0473_Matchsticks_To_Square {

    public boolean makesquare(int[] matchsticks) {
        int sum = Arrays.stream(matchsticks).sum();
        if (sum % 4 != 0) return false;

        int target = sum / 4;
        int[] sides = new int[4];
        Arrays.sort(matchsticks);

        for (int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }

        return backtrack(matchsticks, sides, 0, target);
    }

    private boolean backtrack(int[] matchsticks, int[] sides, int i, int target) {
        if (i == matchsticks.length)
            return true;

        for (int j = 0; j < 4; j++) {
            if (sides[j] + matchsticks[i] <= target) {
                sides[j] += matchsticks[i];
                if (backtrack(matchsticks, sides, i + 1, target))
                    return true;
                sides[j] -= matchsticks[i];
            }

            if (sides[j] == 0) break;
        }

        return false;
    }
}
