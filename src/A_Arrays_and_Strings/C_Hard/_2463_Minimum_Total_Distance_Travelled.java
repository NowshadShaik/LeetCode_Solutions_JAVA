package A_Arrays_and_Strings.C_Hard;

import java.util.*;

public class _2463_Minimum_Total_Distance_Travelled {

    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {

        Collections.sort(robot);
        Arrays.sort(factory, Comparator.comparingInt(a -> a[0]));

        List<Integer> factories = new ArrayList<>();
        for (int[] f : factory) {
            for (int i = 0; i < f[1]; i++) {
                factories.add(f[0]);
            }
        }
        long[][] memo = new long[robot.size()][factories.size()];
        for (long[] arr : memo) Arrays.fill(arr, -1);
        return calculateMinDistance(0, 0, robot, factories, memo);
    }

    private long calculateMinDistance(int robotIdx, int factoryIdx, List<Integer> robot, List<Integer> factories, long[][] memo) {
        if (robotIdx == robot.size()) return 0;
        if (factoryIdx == factories.size()) return (long) 1e12;
        if (memo[robotIdx][factoryIdx] != -1) return memo[robotIdx][factoryIdx];

        long assign = Math.abs(robot.get(robotIdx) - factories.get(factoryIdx)) +
                calculateMinDistance(robotIdx + 1, factoryIdx + 1, robot, factories, memo);

        long skip = calculateMinDistance(robotIdx, factoryIdx + 1, robot, factories, memo);

        memo[robotIdx][factoryIdx] = Math.min(assign, skip);
        return memo[robotIdx][factoryIdx];
    }
}
