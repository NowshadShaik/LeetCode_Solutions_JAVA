package A_Arrays_and_Strings.A_Easy;

import java.util.ArrayList;
import java.util.List;

public class _0933_Number_Of_Recent_Calls {
}

class RecentCounter {
    List<Integer> requests;

    public RecentCounter() {
        this.requests = new ArrayList<>();
    }

    public int ping(int t) {
        requests.add(t);
        while(requests.get(0) < t-3000) {
            requests.remove(0);
        }

        return requests.size();
    }
}