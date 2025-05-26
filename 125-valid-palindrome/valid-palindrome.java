class Solution {
    public boolean isPalindrome(String s) {
     //s=  s.toLowerCase().replaceAll(":","");

       s=s.toLowerCase().replaceAll("[^a-zto0-9]", "");
        
        String sb=new StringBuilder(s).reverse().toString();
        if(s.equals(sb))
    {
            return true;
    }
     return false;
         //return s.equals(sb);

        
    }
}