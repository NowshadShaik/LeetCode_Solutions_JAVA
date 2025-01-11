package Solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _0052_N_Queens_II {

    int res = 0;
    Set<Integer> cols = new HashSet<>();
    Set<Integer> posDiag = new HashSet<>();
    Set<Integer> negDiag = new HashSet<>();

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        for (char[] row : board)
            Arrays.fill(row, ',');

        backtrack(n, 0, board);
        return res;
    }

    private void backtrack(int n, int r, char[][] board) {
        if (r >= n) {
            res++;
            return;
        }

        for (int c = 0; c < n; c++) {
            if (cols.contains(c) || posDiag.contains(c + r) || negDiag.contains(c - r))
                continue;

            cols.add(c);
            posDiag.add(c + r);
            negDiag.add(c - r);
            board[r][c] = 'Q';

            backtrack(n, r + 1, board);

            cols.remove(c);
            posDiag.remove(c + r);
            negDiag.remove(c - r);
            board[r][c] = '.';
        }
    }
}
