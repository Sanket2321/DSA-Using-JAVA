class Solution {
    public int scoreOfString(String s) {
        int total=0;
        for(int i=0;i<s.length()-1;i++){
         total=total+Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return total;
        
    }
}