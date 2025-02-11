package Solutions;

public class _1910_Remove_All_Occurrences_of_a_Substring {

    public String removeOccurrences(String s, String part) {

        while(s.contains(part)) {
            int i = s.indexOf(part);

            s = s.substring(0, i) + s.substring(i + part.length());
        }

        return s;
    }
}
