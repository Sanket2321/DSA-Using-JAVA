class Solution {
    public int minimizedStringLength(String s) {
        //StringBuilder sb=new StringBuilder();
        
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<=s.length()-1;i++){
            set.add(s.charAt(i));
        }

        return set.size();
    }
}