package Solutions;

public class _3443_Maximum_Manhattan_Distance_After_K_Changes {

    public int maxDistance(String s, int k) {
        int res = 0;
        int[] moves = new int[4];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'N')
                moves[0]++;
            else if (s.charAt(i) == 'S')
                moves[1]++;
            else if (s.charAt(i) == 'E')
                moves[2]++;
            else
                moves[3]++;

            int max = i + 1;
            int conflicts = Math.min(moves[0], moves[1]) + Math.min(moves[2], moves[3]);

            int curr = 0;
            if (k >= conflicts)
                curr = max;
            else {
                curr = max - (2 * conflicts);
                curr += (2 * k);
            }

            res = Math.max(res, curr);
        }

        return res;
    }
}
