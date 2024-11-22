package Solutions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class _1072_Flip_Columns_For_Maximum_Number_Of_Equal_Rows {

    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> map = new HashMap<>();

        for(int i=0;i<matrix.length;i++) {
            StringBuilder rowKey = new StringBuilder();
            if(matrix[i][0] == 0) {
                for(int j=0;j<matrix[i].length;j++) rowKey.append(matrix[i][j]);
            } else {
                for(int j=0;j<matrix[i].length;j++) rowKey.append(matrix[i][j] ^ 1);
            }
            map.merge(rowKey.toString(), 1, (a,b) -> a+b);
        }
        return Collections.max(map.values());
    }
}
