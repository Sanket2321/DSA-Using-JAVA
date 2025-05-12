import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i == j || j == k || i == k) continue;

                    int d1 = digits[i];
                    int d2 = digits[j];
                    int d3 = digits[k];

                    if (d1 == 0) continue;         // No leading zero
                    if (d3 % 2 != 0) continue;     // Must be even

                    int num = d1 * 100 + d2 * 10 + d3;
                    result.add(num);
                }
            }
        }

        // Convert set to sorted array
        int[] answer = result.stream().sorted().mapToInt(x -> x).toArray();
        return answer;
    }
}
