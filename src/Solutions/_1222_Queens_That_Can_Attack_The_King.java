package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _1222_Queens_That_Can_Attack_The_King {

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        boolean[][] q = new boolean[8][8];

        for (int[] queen : queens) {
            q[queen[0]][queen[1]] = true;
        }

        List<List<Integer>> res = new ArrayList<>();
        int[][] moves = {{-1, -1}, {-1, 0}, {0, -1}, {1, 1}, {1, 0}, {0, 1}, {1, -1}, {-1, 1}};

        for (int[] move : moves) {
            int x = king[0] + move[0];
            int y = king[1] + move[1];

            while (x >= 0 && y >= 0 && x < 8 && y < 8) {
                if (q[x][y]) {
                    res.add(List.of(x, y));
                    break;
                }
                x += move[0];
                y += move[1];
            }

        }

        return res;
    }
}
