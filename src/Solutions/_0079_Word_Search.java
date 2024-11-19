package Solutions;

import java.util.HashSet;
import java.util.Set;

public class _0079_Word_Search {

    int rows, cols;
    Set<Pair<Integer, Integer>> path = new HashSet<>();
    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(dfs(board, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int r, int c, int i, String word) {
        if(i >= word.length()) {
            return true;
        }

        if(r >= rows || r < 0 || c >= cols || c < 0 ||
                path.contains(new Pair<> (r, c)) || board[r][c] != word.charAt(i)) {
            return false;
        }

        path.add(new Pair<>(r,c));
        boolean res = dfs(board, r + 1, c, i+1, word) || dfs(board, r - 1, c, i+1, word) ||
                dfs(board, r, c + 1, i+1, word) || dfs(board, r, c - 1, i+1, word);

        path.remove(new Pair<>(r, c));

        return res;
    }
}
