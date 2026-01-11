import java.util.*;

class GoatLatin {
    public String toGoatLatin(String sentence) {
        String[] a=sentence.split(" ");
        Set<Character> set=Set.of(
                'a','i','u','e','o',
                'A','I','U','E','O'
                );
        StringBuilder result=new StringBuilder();
        for(int i=0; i<a.length; i++) {
            String str=a[i];
            StringBuilder sb=new StringBuilder();
            if(set.contains(str.charAt(0))) sb.append(str);
            else {
                sb.append(str.substring(1));
                sb.append(str.charAt(0));
            }
            sb.append("ma");
            for(int j=0; j<=i; j++) {
                sb.append("a");
            }
            result.append(sb);
            if(i<a.length-1) result.append(" ");
        }
        return result.toString();
    }
}
