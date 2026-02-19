class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end;
        int max=0;
        Set<Character> set=new HashSet<>();
        for(end=0;end<s.length();end++){
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            max=Math.max(max,end-start+1);


        }
        return max;
    }
}