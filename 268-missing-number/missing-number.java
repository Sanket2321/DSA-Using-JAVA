class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length; // Dynamically get the value of n
        int sum = n * (n + 1) / 2; // Sum of first n natural numbers including 0
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        return sum - total; // Missing number is the difference
    }
}
