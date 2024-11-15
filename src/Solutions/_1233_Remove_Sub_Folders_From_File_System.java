package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1233_Remove_Sub_Folders_From_File_System {

    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> res = new ArrayList<>();
        String prev = null;
        for (String fol : folder) {
            if (prev == null || !fol.startsWith(prev + "/")) {
                res.add(fol);
                prev = fol;
            }
        }
        return res;
    }
}
