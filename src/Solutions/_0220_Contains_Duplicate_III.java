package Solutions;

import java.util.TreeMap;

public class _0220_Contains_Duplicate_III {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if ((r - l) > indexDiff) map.remove(nums[l++]);

            int val = nums[r];
            Integer eog = map.ceilingKey(val);
            Integer eol = map.floorKey(val);

            int diff = eog == null ? Integer.MAX_VALUE : eog - val;

            if (diff > valueDiff)
                diff = eol == null ? Integer.MAX_VALUE : val - eol;

            if (diff <= valueDiff)
                return true;

            map.put(val, 0);
        }
        return false;
    }
}
