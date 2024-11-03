import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        
        for (int num : nums) {
            uniqueNumbers.add(num);           // Add the original number
            uniqueNumbers.add(reverse(num));  // Add the reversed number
        }
        
        return uniqueNumbers.size();
    }

    private int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}
