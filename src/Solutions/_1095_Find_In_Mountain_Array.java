package Solutions;

public class _1095_Find_In_Mountain_Array {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();

        int l = 1, r = length - 2;
        int m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;

            int left = mountainArr.get(m - 1);
            int mid = mountainArr.get(m);
            int right = mountainArr.get(m + 1);

            if (left < mid && mid < right)
                l = m + 1;
            else if (left > mid && mid > right)
                r = m - 1;
            else
                break;
        }

        int peak = m;

        l = 0;
        r = peak;
        while (l <= r) {
            m = l + (r - l) / 2;
            int mid = mountainArr.get(m);

            if (target == mid)
                return m;
            else if (target > mid)
                l = m + 1;
            else
                r = m - 1;
        }

        l = peak;
        r = length - 1;
        while (l <= r) {
            m = l + (r - l) / 2;
            int mid = mountainArr.get(m);

            if (target == mid)
                return m;
            else if (target > mid)
                r = m - 1;
            else
                l = m + 1;
        }

        return -1;
    }

    /**
     * This problem is an interactive problem, The implementation of below class is just placeholder to avoid errors
     */
    private class MountainArray {
        public int get(int m) {
            return 0;
        }

        public int length() {
            return 0;
        }
    }
}
