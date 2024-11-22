package Solutions;

import java.util.Arrays;

public class _1552_Magnetic_Force_Between_Two_Balls {

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int l = 1, r = (position[position.length-1] - position[0]) / (m-1);

        while(l<=r) {
            int mid = l+(r-l)/2;
            if(checkPossible(position, mid, m)) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return r;
    }

    private boolean checkPossible(int[] position, int mid, int m) {
        int count = 1;
        int lastPosition = position[0];

        for(int i=1;i< position.length;i++) {
            if(position[i] - lastPosition >= mid) {
                count++;
                lastPosition = position[i];
                if(count == m) return true;
            }
        }
        return false;
    }
}
