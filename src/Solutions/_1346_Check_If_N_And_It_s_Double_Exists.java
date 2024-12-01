package Solutions;

import java.util.HashSet;
import java.util.Set;

public class _1346_Check_If_N_And_It_s_Double_Exists {

    public boolean checkIfExist(int[] arr) {
        Set<Integer> previous = new HashSet<>();

        for(int n : arr) {
            if(previous.contains(2 * n) || (n % 2 == 0 && previous.contains(n/2))) return true;
            previous.add(n);
        }
        return false;
    }
}
