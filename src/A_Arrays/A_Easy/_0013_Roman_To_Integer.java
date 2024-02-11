package A_Arrays.A_Easy;

import java.util.Map;
import java.util.HashMap;

public class _0013_Roman_To_Integer {

    class Solution {
        public int romanToInt(String s) {
    
            Map<Character,Integer> values = new HashMap<>();
            values.put('I',1);
            values.put('V',5);
            values.put('X',10);
            values.put('L',50);
            values.put('C',100);
            values.put('D',500);
            values.put('M',1000);
            int l = s.length()-1;
            int ans = values.get(s.charAt(l));
            int prev = ans;
    
            for(int i=s.length()-2;i>=0;i--) {
                int curr = values.get(s.charAt(i));
                int a = (prev>curr) ? (ans-=curr) : (ans+=curr);
                prev = curr;
            }
            return ans;
            
        }
    }
}
