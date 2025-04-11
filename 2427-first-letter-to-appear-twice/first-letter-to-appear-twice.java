
class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> s1 = new HashSet<>();
        
        for (char ch : s.toCharArray()) {
            if (s1.contains(ch)) {
                return ch; // Return the first character that appears twice
            }
            s1.add(ch);
        }
        
        return '\0'; 
    }
}