import java.util.*;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        List<Integer> l = new ArrayList<>();
        int n = nums.length;
        
        for (String s : nums) {
            l.add(Integer.parseInt(s, 2)); // Convert binary strings to integers
        }

        // Find the missing binary number
        for (int i = 0; i < (1 << n); i++) { // Iterate from 0 to 2^n - 1
            if (!l.contains(i)) { // If i is not in the list
                String binaryString = Integer.toBinaryString(i);
                return String.format("%" + n + "s", binaryString).replace(' ', '0'); // Format to n bits
            }
        }

        return ""; // Should never reach here
    }
}
