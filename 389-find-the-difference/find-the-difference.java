class Solution {
    public char findTheDifference(String s, String t) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            total = total + s.charAt(i);
        }
        int total1 = 0;
        for (int j = 0; j < t.length(); j++) {
            total1 = total1 + t.charAt(j);

        }

        return (char) (total1 - total);
    }
}