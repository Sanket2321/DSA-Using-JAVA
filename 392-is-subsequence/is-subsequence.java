class Solution {
    public boolean isSubsequence(String s, String t) {
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        int n1 = s1.length;
        int n2 = t1.length;
        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (s1[i] == t1[j]) {
                i++;
            }
            j++;
        }
        return i == n1;
    }
}