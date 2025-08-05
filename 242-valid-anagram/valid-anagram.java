class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[]=s.toCharArray();
        char ch1[]=t.toCharArray();
   
         Arrays.sort(ch);
         Arrays.sort(ch1);
         return Arrays.equals(ch,ch1);

    }
}