package Solutions;

public class _2381_Shifting_Letters_II {

    public String shiftingLetters(String s, int[][] shifts) {
        char[] res = s.toCharArray();
        int[] diff = new int[s.length() + 1];

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int dir = shift[2];

            diff[end + 1] += (dir == 1) ? 1 : -1;
            diff[start] += (dir == 1) ? -1 : 1;
        }

        int sum = 0;
        for (int i = diff.length - 1; i > 0; i--) {
            sum += diff[i];
            int n = ((res[i - 1] - 'a') + sum) % 26;
            if (n < 0)
                n += 26;
            res[i - 1] = (char) (n + 'a');
        }

        return new String(res);
    }
}
