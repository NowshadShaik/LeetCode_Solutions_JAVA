package Solutions;

public class _3000_Max_Area_Of_Longest_Diagonal_Rectangle {

    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiag = 0.0;
        int res = 0;

        for(int[] rectangle : dimensions) {
            int currArea = rectangle[0] * rectangle[1];
            double currDiag = Math.sqrt((rectangle[0] * rectangle[0]) + (rectangle[1] * rectangle[1]));

            if(currDiag > maxDiag) {
                maxDiag = currDiag;
                res = currArea;
            } else if(currDiag == maxDiag) {
                res = Math.max(res, currArea);
            }
        }

        return res;
    }
}
