package Solutions;

public class _0812_Largest_Triangle_Area {

    public double largestTriangleArea(int[][] points) {
        double res = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {

                    res = Math.max(res, area(points[i], points[j], points[k]));
                }
            }
        }

        return res;
    }

    private double area(int[] a, int[] b, int[] c) {
        return 0.5 * Math.abs(a[0] * b[1] + b[0] * c[1] + c[0] * a[1]
                - a[1] * b[0] - b[1] * c[0] - c[1] * a[0]);
    }
}
