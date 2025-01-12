package Solutions;

public class _0997_Find_The_Town_Judge {

    public int findJudge(int n, int[][] trust) {
        int[] delta = new int[n + 1];

        for (int[] t : trust) {
            delta[t[1]]++;
            delta[t[0]]--;
        }

        for (int i = 1; i <= n; i++) {
            if (delta[i] == n - 1)
                return i;
        }

        return -1;
    }
}
