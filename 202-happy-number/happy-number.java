import java.util.HashSet;

class Solution {
    HashSet<Integer> s = new HashSet<>();

    public boolean isHappy(int n) {
        if (n == 1) return true;                 // Base case: if n is 1, it's a happy number

        if (s.contains(n)) return false;      // If we've already seen this number, we're in a cycle ➜ unhappy

        s.add(n);                             // Add the number to our seen set

        int sum = 0;                             // To store the sum of squares of digits
        while (n > 0) {
            int digit = n % 10;                  // Get the last digit
            sum += digit * digit;                // Square it and add to sum
            n /= 10;                             // Remove the last digit
        }

        return isHappy(sum);                     // Recursively check the new sum
    }
}
