package Solutions;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class _2514_Count_Anagrams {

    long mod = (long) (1e9 + 7);
    long[] fac;

    public int countAnagrams(String s) {
        fac = new long[s.length() + 1];
        fac[1] = 1;
        for(int i=2;i<=s.length();i++) {
            fac[i] = (fac[i-1] * i) % mod;
        }

        String[] words = s.split(" ");
        long res = 1;
        for(String word : words) {
            res = (res * countWordAnagrams(word)) % mod;
        }
        return (int)res;
    }

    private long countWordAnagrams(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        long all = fac[word.length()];

        for(int val : map.values()) {
            long inv = BigInteger.valueOf(fac[val]).modInverse(BigInteger.valueOf(mod)).longValue();
            all = (all * inv) % mod;
        }

        return all;
    }
}
