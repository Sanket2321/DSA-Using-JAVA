class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String double1=s+s;
        String trim=double1.substring(1,double1.length()-1);
    
        return trim.contains(s);
        
    }
}