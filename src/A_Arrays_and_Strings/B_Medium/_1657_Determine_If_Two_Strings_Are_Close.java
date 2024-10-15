package A_Arrays_and_Strings.B_Medium;

import java.util.Arrays;

public class _1657_Determine_If_Two_Strings_Are_Close {

    public boolean closeStrings(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (char c : word1.toCharArray()) {
            arr1[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            arr2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((arr1[i] == 0 && arr2[i] != 0) || (arr1[i] != 0 && arr2[i] == 0))
                return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }
}
