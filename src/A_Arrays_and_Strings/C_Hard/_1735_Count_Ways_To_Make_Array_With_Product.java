package A_Arrays_and_Strings.C_Hard;

public class _1735_Count_Ways_To_Make_Array_With_Product {

    int M = (int) 1e9 + 7;

    public int[] waysToFillArray(int[][] queries) {
        int qn = queries.length;
        int[] ans = new int[qn];
        long[][] comb = new long[100015][15];  // max POW of prime here is 14
        for (int i = 0; i < 100015; i++) {
            comb[i][0] = 1;
            for (int j = 1; j <= Math.min(14, i); j++) {
                comb[i][j] = (comb[i - 1][j - 1] + comb[i - 1][j]) % M;
            }
        }

        for (int i = 0; i < qn; i++) {
            long currAns = 1;
            int arrSize = queries[i][0];
            int prod = queries[i][1];
            int dividers = arrSize - 1;
            for (int p = 2; p <= prod; p++) {  // factorise X; the target product
                int pow = 0;
                while (prod % p == 0) {
                    prod /= p;
                    pow++;
                }
                currAns = currAns * comb[pow + dividers][pow] % M;
            }
            ans[i] = (int) (currAns % M);
        }
        return ans;
    }
}
