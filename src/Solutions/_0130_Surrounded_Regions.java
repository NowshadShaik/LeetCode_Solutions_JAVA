package Solutions;

public class _0130_Surrounded_Regions {

    int r;
    int c;

    public void solve(char[][] board) {
        r = board.length;
        c = board[0].length;

        for (int i = 0; i < r; i++) {
            if (board[i][0] == 'O')
                dfs(i, 0, board);

            if (board[i][c - 1] == 'O')
                dfs(i, c - 1, board);
        }

        for (int i = 0; i < c; i++) {
            if (board[0][i] == 'O')
                dfs(0, i, board);

            if (board[r - 1][i] == 'O')
                dfs(r - 1, i, board);
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (board[i][j] == '.')
                    board[i][j] = 'O';
                else
                    board[i][j] = 'X';
            }
        }
    }

    private void dfs(int i, int j, char[][] board) {
        if (i < 0 || j < 0 || i >= r || j >= c || board[i][j] != 'O')
            return;

        board[i][j] = '.';

        dfs(i + 1, j, board);
        dfs(i - 1, j, board);
        dfs(i, j + 1, board);
        dfs(i, j - 1, board);
    }
}
