import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer, String> map = new HashMap<>();

        // store height and name
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        // sort heights descending
        Arrays.sort(heights);

        String[] result = new String[names.length];
        int index = 0;

        // traverse from largest height
        for (int i = heights.length - 1; i >= 0; i--) {
            result[index++] = map.get(heights[i]);
        }

        return result;
    }
}
