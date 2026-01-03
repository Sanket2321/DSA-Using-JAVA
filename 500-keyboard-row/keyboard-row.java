class Solution {
    public String[] findWords(String[] words) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Row 1
        map.put('q', 1); map.put('w', 1); map.put('e', 1); map.put('r', 1);
        map.put('t', 1); map.put('y', 1); map.put('u', 1); map.put('i', 1);
        map.put('o', 1); map.put('p', 1);

        // Row 2
        map.put('a', 2); map.put('s', 2); map.put('d', 2); map.put('f', 2);
        map.put('g', 2); map.put('h', 2); map.put('j', 2); map.put('k', 2);
        map.put('l', 2);

        // Row 3
        map.put('z', 3); map.put('x', 3); map.put('c', 3); map.put('v', 3);
        map.put('b', 3); map.put('n', 3); map.put('m', 3);

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String w = word.toLowerCase();
          //finding the row
            int row = map.get(w.charAt(0));
            boolean valid = true;

            for (char ch : w.toCharArray()) {
                //cheching each character from apporipate row 
                if (map.get(ch) != row) {
                    valid = false;
                    break;
                }
            }
 // if row found same add to arraylist 
            if (valid)
                result.add(word);
        }

        return result.toArray(new String[result.size()]);
    }
}
