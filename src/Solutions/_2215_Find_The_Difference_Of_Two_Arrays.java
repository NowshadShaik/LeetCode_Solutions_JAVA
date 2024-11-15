package Solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2215_Find_The_Difference_Of_Two_Arrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        for (int i : set1) {
            if (!set2.contains(i)) {
                ans.get(0).add(i);
            }
        }
        for (int i : set2) {
            if (!set1.contains(i)) {
                ans.get(1).add(i);
            }
        }
        return ans;

    }
}
