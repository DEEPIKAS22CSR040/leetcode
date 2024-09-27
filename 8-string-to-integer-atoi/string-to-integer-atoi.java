class Solution {
    public int myAtoi(String s) {
        // Step 1: Remove leading whitespace
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        // Step 2: Determine the sign
        int sign = 1;
        int index = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }

        // Step 3: Convert characters to integer
        long result = 0;
        while (index < s.length()) {
            char currentChar = s.charAt(index);
            
            if (!Character.isDigit(currentChar)) {
                break;
            }

            result = result * 10 + (currentChar - '0');
            
            // Step 4: Check for overflow
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            index++;
        }

        // Step 5: Return the final result with sign
        return (int) (result * sign);
    }
}
