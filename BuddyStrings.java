import java.util.*;

class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        if(Objects.equals(s,goal)) {
            Set<Character> set=new HashSet<>();
            for(int i=0; i<s.length(); i++) {
                if(set.contains(s.charAt(i))) return true;
                set.add(s.charAt(i));
            }
            return false;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)!=goal.charAt(i)) list.add(i);
        }
        if(list.size()==2) {
            int i=list.get(0);
            int j=list.get(1);
            return s.charAt(i)==goal.charAt(j)&&s.charAt(j)==goal.charAt(i);
        }
        return false;
    }
}
