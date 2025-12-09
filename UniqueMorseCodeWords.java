import java.util.*;

class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> result = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        String[] morse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", 
                "....", "..", ".---", "-.-", ".-..", "--", "-.", 
                "---", ".--.", "--.-", ".-.", "...", "-", 
                "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                sb.append(morse[words[i].charAt(j) - 'a']);
            }
            result.add(sb.toString());
            sb.setLength(0);
        }
        return result.size();
    }
}
