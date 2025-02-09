import java.util.*;

class Solution {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        TreeSet<Integer> set = new TreeSet<>();
        int min = Integer.MAX_VALUE;

        for (int i = x; i < nums.size(); i++) {
            set.add(nums.get(i - x));  // Insert element at i-x into TreeSet

            Integer lower = set.floor(nums.get(i));  // Closest smaller or equal element
            Integer higher = set.ceiling(nums.get(i));  // Closest larger or equal element

            if (lower != null) min = Math.min(min, Math.abs(nums.get(i) - lower));
            if (higher != null) min = Math.min(min, Math.abs(nums.get(i) - higher));
        }
        return min;
    }
}
