import java.util.*;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        even.addAll(odd); // Append odd numbers after even ones

        // Convert List back to array
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = even.get(i);
        }

        return result;
    }
}
