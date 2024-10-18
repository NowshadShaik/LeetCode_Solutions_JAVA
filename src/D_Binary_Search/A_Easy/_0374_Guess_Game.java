package D_Binary_Search.A_Easy;

public class _0374_Guess_Game {

    public int guessNumber(int n) {
        int l = 1;
        int r = n;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int guess = guess(mid);

            if (guess == 0) {
                return mid;
            } else if (guess == -1) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    /** Below method is a placeholder **/
    private int guess(int a) {
        return -1;
    }
}
