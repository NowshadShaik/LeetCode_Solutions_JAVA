package Solutions;

public class _3516_Find_Closest_Person {

    public int findClosest(int x, int y, int z) {
        int l = Math.abs(x - z);
        int r = Math.abs(y - z);

        if (l == r)
            return 0;
        else if (l < r)
            return 1;
        else
            return 2;
    }
}
