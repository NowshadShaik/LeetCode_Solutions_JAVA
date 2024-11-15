package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0049_Group_Anagrams {
        public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for(int i=0;i<strs.length;i++) {
            int[] values = new int[26];

            for(char c: strs[i].toCharArray()) {
                values[c - 'a']++;
            }

            String key = Arrays.toString(values);

            if(!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(strs[i]);
        }

        return new ArrayList<>(ans.values());
    }
}
