class Solution {
    public String reverseWords(String s) {
       
            String s2[]=s.split(" +");
              StringBuilder sb=new StringBuilder();
              for(int i=s2.length-1;i>=0;i--){
              sb.append(s2[i]);
              sb.append(" ");

              }
              return sb.toString().trim();
            
}
}