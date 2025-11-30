import java.util.*;

class GenerateParentheses {
    public List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        backTrack(result, "", 0, 0, n);
        return result;
    }

    private void backTrack(List<String>r, String cS, int o, int c, int n) {
        if (cS.length() == n * 2) {
            r.add(cS);
            return;
        }
        if (o < n) backTrack(r, cS + "(", o + 1, c, n);
        if (c < o) backTrack(r, cS + ")", o, c + 1, n);
    }
}
