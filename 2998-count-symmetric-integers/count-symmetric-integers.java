class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i);
            int len = s.length();

            // Skip if number has odd digits
            if (len % 2 != 0) continue;

            int mid = len / 2;
            int sum1 = 0, sum2 = 0;

            // Sum of first half
            for (int j = 0; j < mid; j++) {
                sum1 += s.charAt(j) - '0';
            }

            // Sum of second half
            for (int j = mid; j < len; j++) {
                sum2 += s.charAt(j) - '0';
            }

            // Check if both halves are equal
            if (sum1 == sum2) {
                count++;
            }
        }

        return count;
    }
}
