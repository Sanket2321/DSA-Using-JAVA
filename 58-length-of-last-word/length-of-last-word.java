class Solution {
    public int lengthOfLastWord(String s) {
       s=s.trim();
       String  ch[]=s.split(" ");
       return ch[ch.length-1].length();
    }
}