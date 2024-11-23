package Solutions;

import java.util.Arrays;

public class _1861_Rotating_The_Box {

    public char[][] rotateTheBox(char[][] box) {
        int rows = box.length;
        int cols = box[0].length;

        char[][] res = new char[cols][rows];
        for(char[] row : res) {
            Arrays.fill(row, '.');
        }

        for(int i=0;i<rows;i++) {
            int a = cols-1;
            for(int j=cols-1;j>=0;j--) {
                if(box[i][j] == '#') {
                    res[a][rows - i - 1] = '#';
                    a--;
                } else if (box[i][j] == '*') {
                    res[j][rows - i - 1] = '*';
                    a = j - 1;
                }
            }
        }
        return res;
    }
}
