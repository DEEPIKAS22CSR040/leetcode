import java.util.*;

class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] prefixSums = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }
        return countWhileMergeSort(prefixSums, 0, prefixSums.length, lower, upper);
    }

    private int countWhileMergeSort(long[] sums, int start, int end, int lower, int upper) {
        if (end - start <= 1) return 0;
        int mid = (start + end) / 2;
        int count = countWhileMergeSort(sums, start, mid, lower, upper) 
                  + countWhileMergeSort(sums, mid, end, lower, upper);
        long[] cache = new long[end - start];
        int t = mid, r = mid, k = 0;
        for (int i = start, j = mid; i < mid; i++) {
            while (t < end && sums[t] - sums[i] < lower) t++;
            while (r < end && sums[r] - sums[i] <= upper) r++;
            count += r - t;
            while (j < end && sums[j] < sums[i]) cache[k++] = sums[j++];
            cache[k++] = sums[i];
        }
        System.arraycopy(cache, 0, sums, start, k);
        return count;
    }
}
