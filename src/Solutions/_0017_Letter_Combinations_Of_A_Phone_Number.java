package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0017_Letter_Combinations_Of_A_Phone_Number {

    List<List<String>> res = new ArrayList<>();
    List<String> part = new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(0, 0, s);
        return res;
    }

    private void dfs(int l, int r, String s) {
        if(r >= s.length()) {
            if(l == r) {
                res.add(new ArrayList<>(part));
            }
            return;
        }

        if(isPalindrome(l, r, s)) {
            part.add(s.substring(l, r+1));
            dfs(r+1, r+1, s);
            part.remove(part.size()-1);
        }
        dfs(l, r+1, s);
    }

    private boolean isPalindrome(int l, int r, String s) {
        while(l<r) {
            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
