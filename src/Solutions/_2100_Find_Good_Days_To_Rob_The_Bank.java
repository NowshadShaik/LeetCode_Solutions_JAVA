package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _2100_Find_Good_Days_To_Rob_The_Bank {

    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> res = new ArrayList<>();
        int[] prefix = new int[security.length];
        prefix[0] = 0;

        for(int i=1;i<security.length;i++) {
            if(security[i] <= security[i-1]) {
                prefix[i] = prefix[i-1]+1;
            } else {
                prefix[i] = 0;
            }
        }

        int[] postfix = new int[security.length];
        postfix[security.length-1] = 0;

        for(int i=security.length-2; i>=0;i--) {
            if(security[i] <= security[i+1]) {
                postfix[i] = postfix[i+1]+1;
            } else {
                postfix[i] = 0;
            }
        }

        for(int i=time;i<security.length-time;i++) {
            if(prefix[i] >= time && postfix[i] >= time) res.add(i);
        }
        return res;
    }
}
