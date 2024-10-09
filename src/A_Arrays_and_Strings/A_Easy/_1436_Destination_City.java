package A_Arrays_and_Strings.A_Easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _1436_Destination_City {

    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();

        for (List<String> path : paths)
            set.add(path.get(0));

        for (List<String> path : paths) {
            if (!set.contains(path.get(1))) {
                return path.get(1);
            }
        }

        return null;
    }
}
