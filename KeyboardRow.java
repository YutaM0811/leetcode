import java.util.

class KeyboardRow {
    public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        char[] row1 = "qwertyuiop".toCharArray();
        char[] row2 = "asdfghjkl".toCharArray();
        char[] row3 = "zxcvbnm".toCharArray();

        for (int i = 0; i < row1.length; i++) {
            map.put(row1[i], 1);
        }
        for (int i = 0; i < row2.length; i++) {
            map.put(row2[i], 2);
        }
        for (int i = 0; i < row3.length; i++) {
            map.put(row3[i], 3);
        }

        for (int i = 0; i < words.length; i++) {
            String s = words[i].toLowerCase();
            int r = map.get(s.charAt(0));
            boolean b = true;
            for (int j = 1; j < s.length(); j++) {
                if (r != map.get(s.charAt(j))) {
                    b = false;
                    break;
                }
            }
            if (b) list.add(words[i]);
        }
        return list.toArray(new String[list.size()]);
    }
}
