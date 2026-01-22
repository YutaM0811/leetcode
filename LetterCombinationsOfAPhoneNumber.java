import java.util.*;

class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        String[] m={
            "",
            "","abc","def",
            "ghi","jkl","mno",
            "pqrs","tuv","wxyz"
        };
        List<String> list=new ArrayList<>();
        if(digits.length()==0) return list;
        for(int i=0; i<digits.length(); i++) {
            int d=digits.charAt(i)-'0';
            String l=m[d];
            List<String> n=new ArrayList<>();
            if(list.isEmpty()) {
                for(char c:l.toCharArray()) {
                    n.add(String.valueOf(c));
                }
            } else {
                for(String s:list) {
                    for(char c:l.toCharArray()) {
                        n.add(s+c);
                    }
                }
            }
            list=n;
        }
        return list;
    }
}
